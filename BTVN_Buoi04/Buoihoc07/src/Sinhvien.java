public class Sinhvien extends Person {
    private String maSinhVien;
    private String lop;

    public Sinhvien() {
    }

    public Sinhvien(String name, String quequan, Integer age) {
        super(name, quequan, age);
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
