<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="url" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <title>Chi Tiết Đơn Hàng</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h2 class="mb-3">Chi Tiết Đơn Hàng</h2>

            <!-- Thông tin đơn hàng -->
            <div class="card mb-4">
                <div class="card-body">
                    <h5>Order ID: ${donHang.madonhang}<strong></strong></h5>
                    <p>Ngày đặt hàng: ${donHang.ngaydathang}</p>
                    <p>Trạng thái: <span class="text-success">${donHang.trangthaidonhang}</span></p>
                </div>
            </div>

            <!-- Thông tin khách hàng -->
            <div class="card mb-4">
                <div class="card-body">
                    <h5>Thông Tin Khách Hàng</h5>
                    <p><strong>Họ và tên: ${khachHang.hoVaTen}</strong> </p>
                    <p><strong>Số điện thoại: ${khachHang.soDienThoai}</strong> </p>
                    <p><strong>Email: ${khachHang.email}</strong> </p>
                </div>
            </div>

            <!-- Danh sách sản phẩm trong đơn hàng -->
            <h4>Danh Sách Sản Phẩm</h4>
            <table class="table table-bordered">
                <thead class="table-light">
                    <tr>
                        <th>Hình ảnh</th>
                        <th>Ma san pham</th>
                        <th>Tên sản phẩm</th>
                        <th>Loại</th>
                        <th>Mau sac</th>
                        <th>Size</th>
                        <th>Số lượng</th>
                        <th>Giá nhap</th>
                        <th>Giá ban</th>
                        <th>Giam gia</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="listOderDetails" items="${listOderDetails}">
                        <tr>

                            <td><img src="" width="50">${listOderDetails.sanPham.hinhanhsanpham}</td>
                            <td>${listOderDetails.sanPham.masanpham}</td>
                            <td>${listOderDetails.sanPham.tensanpham}</td>
                            <td>${listOderDetails.categories.categoryName}</td>
                            <td>${listOderDetails.sanPham.mausac}</td>
                            <td>${listOderDetails.chiTietDonHang.size}</td>
                            <td>${listOderDetails.chiTietDonHang.soluongsanphammua}</td>
                            <td>${listOderDetails.sanPham.gianhap}</td>
                            <td>${listOderDetails.sanPham.giaban}</td>
                            <td>${listOderDetails.sanPham.giamgia}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <!-- Tổng tiền -->
            <h3 class="text-end">Tổng: <span class="text-danger"> ${donHang.tongtien}VNĐ</span></h3>

            <!-- Nút Quay lại -->
            <a href="${url}/admin?hanhdong=order" class="btn btn-secondary">Quay lại</a>
        </div>
    </body>
</html>
