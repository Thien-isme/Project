package model;

public class MaGiamGia {

    private String idMaGiamGia;
    private String tenMaGiamGia;
    private String tiLeGiam;
    private String ngayHetHan;

    public MaGiamGia(String idMaGiamGia, String tenMaGiamGia, String tiLeGiam, String ngayHetHan) {
        this.idMaGiamGia = idMaGiamGia;
        this.tenMaGiamGia = tenMaGiamGia;
        this.tiLeGiam = tiLeGiam;
        this.ngayHetHan = ngayHetHan;
    }

    public String getIdMaGiamGia() {
        return idMaGiamGia;
    }

    public void setIdMaGiamGia(String idMaGiamGia) {
        this.idMaGiamGia = idMaGiamGia;
    }

    public String getTenMaGiamGia() {
        return tenMaGiamGia;
    }

    public void setTenMaGiamGia(String tenMaGiamGia) {
        this.tenMaGiamGia = tenMaGiamGia;
    }

    public String getTiLeGiam() {
        return tiLeGiam;
    }

    public void setTiLeGiam(String tiLeGiam) {
        this.tiLeGiam = tiLeGiam;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
    

}