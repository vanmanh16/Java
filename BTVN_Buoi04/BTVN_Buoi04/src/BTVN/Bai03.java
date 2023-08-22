package BTVN;

import java.util.Scanner;

class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public SinhVien() {
        this.maSinhVien = "";
        this.hoTen = "";
        this.diemToan = 0;
        this.diemLy = 0;
        this.diemHoa = 0;
    }

    public SinhVien(String maSinhVien, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.maSinhVien = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập điểm toán: ");
        this.diemToan = scanner.nextFloat();
        System.out.print("Nhập điểm lý: ");
        this.diemLy = scanner.nextFloat();
        System.out.print("Nhập điểm hóa: ");
        this.diemHoa = scanner.nextFloat();
    }

    public void inThongTin() {
        System.out.printf("%-15s %-20s %-10.2f %-10.2f %-10.2f %-10.2f\n", this.maSinhVien, this.hoTen, this.diemToan, this.diemLy, this.diemHoa, (this.diemToan + this.diemLy + this.diemHoa) / 3);
    }
}

public class Bai03 {
    public static void main(String[] args) {
        SinhVien[] sinhViens = new SinhVien[5];
        for (int i = 0; i < 5; i++) {
            sinhViens[i] = new SinhVien();
            sinhViens[i].nhap();
            System.out.println();
        }

        System.out.printf("%-15s %-20s %-10s %-10s %-10s %-10s\n", "Mã sinh viên", "Họ tên", "Điểm toán", "Điểm lý", "Điểm hóa", "Điểm trung bình");

        for (int i = 0; i < 5; i++) {
            sinhViens[i].inThongTin();
            System.out.println();
        }
    }
}



