public class Nhanvien extends Person {
    private String maNhanvien;
    private String chuyenNganh;
    private Long soDienthoai;

    public Nhanvien(String maNhanvien, String chuyenNganh, Long soDienthoai) {
        this.maNhanvien = maNhanvien;
        this.chuyenNganh = chuyenNganh;
        this.soDienthoai = soDienthoai;
    }

    public Nhanvien() {
    }

    public String getMaNhanvien() {
        return maNhanvien;
    }

    public void setMaNhanvien(String maNhanvien) {
        this.maNhanvien = maNhanvien;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public Long getSoDienthoai() {
        return soDienthoai;
    }

    public void setSoDienthoai(Long soDienthoai) {
        this.soDienthoai = soDienthoai;
    }

    @
}
