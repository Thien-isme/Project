/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ChiTietDonHang;
import model.GioHang;
import utils.JDBCUtil;
import utils.Time;

/**
 *
 * @author Admin
 */
public class ChiTietDonHangDAO {

    public int insert(ChiTietDonHang ctdh) throws SQLException {
        int result = 0;
        

        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO chitietdonhang VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ctdh.getMadonhang());
            ps.setString(2, ctdh.getMasanpham());
            ps.setString(3, ctdh.getSize());
            ps.setInt(4, ctdh.getSoluongsanphammua());
            ps.setDouble(5, ctdh.getGiaban());
            result = ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ChiTietDonHang select(String madonhang) throws SQLException {
        ChiTietDonHang ketQua = null;

        try {
            Connection con = JDBCUtil.getConnection();

            String sql = " SELECT * \n"
                    + " FROM chitietdonhang\n"
                    + " WHERE madonhang = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, madonhang);

            ResultSet rs = ps.executeQuery();

            

            JDBCUtil.close(con);

        } catch (Exception e) {
        }

        return ketQua;
    }

    
}