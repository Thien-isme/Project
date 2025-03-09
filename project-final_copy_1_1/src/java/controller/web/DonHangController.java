/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.web;

import database.ChiTietDonHangDAO;
import database.DonHangDAO;
import database.GioHangDAO;
import database.MaGiamGiaDAO;
import database.OrderHistoryDAO;
import database.SanPhamDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ChiTietDonHang;
import model.DonHang;
import model.GioHang;
import model.KhachHang;
import model.MaGiamGia;
import model.Order;
import model.OrderHistory;
import model.SanPham;
import utils.Time;

/**
 *
 * @author Admin
 */
@WebServlet(name = "DonHangController", urlPatterns = {"/don-hang"})
public class DonHangController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("hanhdong");
        if (action.equals("saveDonHang")) {
            saveDonHang(request, response);
        } else if(action.equals("myorder")){
            myorder(request, response);
        }
    }
    
    private void saveDonHang(HttpServletRequest request, HttpServletResponse response) {
        try {
            String maKhachHang = request.getParameter("makhachhang");
            String fullName = request.getParameter("fullname");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String quocGia = request.getParameter("quocgia");
            String deliveryaddress = request.getParameter("deliveryaddress");
            String paymentMethod = request.getParameter("paymentMethod");
            
            String soLuongMaSanPham = request.getParameter("soluongmasanpham");
            
            List<SanPham> productList = new ArrayList<>();
            
            for (int i = 1;; i++) {
                String maSanPham = request.getParameter("sanpham" + i);
                if (maSanPham == null) {
                    break; // Dừng khi không còn sản phẩm
                }
                String size = request.getParameter("sizesanpham" + i);
                String soLuong = request.getParameter("soluongsanpham" + i);
                String giaTien = request.getParameter("giatiensanpham" + i);
                
                SanPham sp = new SanPham();
                sp.setMasanpham(maSanPham);
                sp.setKichco(size);
                sp.setSoluong(Integer.parseInt(soLuong));
                sp.setGiaban(Double.parseDouble(giaTien));
                
                productList.add(sp);
            }

            // Thêm vào bảng đơn hàng trước
            Random rd = new Random();
            String madonhang = System.currentTimeMillis() + rd.nextInt(1000) + "";
            String makhachhang = maKhachHang;
            String ngaydathang = Time.getTimeNow();
            String ngaygiaohanhdukien = Time.timeNowPlus_X_minutes(7200);
            String trangthaidonhang = "Mới tạo";
            String phuongthucthanhtoan = paymentMethod;
            String diachigiaohang = deliveryaddress;
            
            String idmagiamgia = request.getParameter("idmagiamgia");
            String ship = request.getParameter("ship");
            String total = request.getParameter("total");
            Double feeship = 30000.0;
            Double tongtien = Double.parseDouble(total);
            
            Double vat = 0.0;
            if (!quocGia.equals("Việt Nam")) {
                vat = (Double) tongtien * 0.1;
                tongtien = tongtien + vat;
            }
            
            if (idmagiamgia != null) {
                MaGiamGiaDAO dao = new MaGiamGiaDAO();
                MaGiamGia magiamgia = dao.selectById(idmagiamgia);
                
                if (magiamgia != null && magiamgia.getTheloai().equals("freeship")) {
                    feeship = 0.0;
                    tongtien = tongtien - feeship;
                } else {
                    Double giamGia = (Double) (tongtien * magiamgia.getTiLeGiam()) / 100;
                    tongtien = tongtien - giamGia;
                    
                    tongtien = tongtien + feeship;
                }
            } else {
                tongtien = tongtien + feeship;
            }
            
            DonHang donhang = new DonHang();
            donhang.setMadonhang(madonhang);
            donhang.setMakhachhang(makhachhang);
            donhang.setNgaydathang(ngaydathang);
            donhang.setNgaygiaohangdukien(ngaygiaohanhdukien);
            donhang.setTrangthaidonhang(trangthaidonhang);
            donhang.setPhuongthucthanhtoan(phuongthucthanhtoan);
            donhang.setDiachigiaohang(diachigiaohang);
            donhang.setIdmagiamgia(idmagiamgia);
            
            if (feeship > 0) {
                donhang.setTienvanchuyen(feeship);
            } else {
                donhang.setTienvanchuyen(0.0);
            }
            
            if (vat > 0) {
                donhang.setVat(vat);                
            } else {
                donhang.setVat(0.0);
            }
            
            donhang.setTongtien(tongtien);
            
            DonHangDAO donHangDAO = new DonHangDAO();
            donHangDAO.insert(donhang);

            // Lưu xuống chi tiết đơn hàng
            for (SanPham sanPham : productList) {
                
                ChiTietDonHang chiTietDonHang = new ChiTietDonHang();
                chiTietDonHang.setMadonhang(madonhang);
                chiTietDonHang.setMasanpham(sanPham.getMasanpham());
                chiTietDonHang.setSize(sanPham.getKichco());
                chiTietDonHang.setSoluongsanphammua(sanPham.getSoluong());
                chiTietDonHang.setGiaban(sanPham.getGiaban());
                
                ChiTietDonHangDAO dao = new ChiTietDonHangDAO();
                dao.insert(chiTietDonHang);
                
                SanPhamDAO sanPhamDAO = new SanPhamDAO();
                sanPhamDAO.minusPoduct(sanPham.getMasanpham(), sanPham.getKichco(), sanPham.getSoluong());
                
            }
            String prevaction = request.getParameter("prevaction");
            if(prevaction.equals("checkout")){
                Order order = new Order();
            HttpSession session = request.getSession(false);
            session.setAttribute("order", order);
            }
            
            
            
            
            request.setAttribute("madonhang", madonhang);
            request.getRequestDispatcher("/GUI/index.jsp").forward(request, response);

            //     }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void chuyenquacheckout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        
    }

    private void myorder(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();
            KhachHang khachhang = (KhachHang) session.getAttribute("khachHang");
            
             List<OrderHistory> list = new ArrayList<OrderHistory>();
            if(khachhang!=null){
                
                OrderHistoryDAO dao = new OrderHistoryDAO();
                list = dao.selectByIdMaKhachHang(khachhang.getMaKhachHang());
                
                
                
                
                request.setAttribute("list", list);
                
                request.getRequestDispatcher("/khachhang/historyorder.jsp").forward(request, response); 

                
            }
            
            
            
            
            
        } catch (Exception e) {
        }
       
    }
    
}
