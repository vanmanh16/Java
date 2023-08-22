package BTVN;

import java.util.Scanner;

public class Bai01 {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatBan;

    public Bai01() {
        maSach = "";
        tenSach = "";
        tenTacGia = "";
        nhaXuatBan = "";
        namXuatBan = 0;
    }

    public Bai01(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhap ten tac gia: ");
        tenTacGia = scanner.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = scanner.nextInt();
    }

    public void xuat() {
        System.out.printf("%-10s %-20s %-20s %-20s %-10d\n", maSach, tenSach, tenTacGia, nhaXuatBan, namXuatBan);
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }
}

class Main {
    public static void main(String[] args) {
        Bai01[] sach = new Bai01[5];

        for (int i = 0; i < 5; i++) {
            sach[i] = new Bai01();
            System.out.println("Nhap thong tin sach thu " + (i + 1));
            sach[i].nhap();
            System.out.println();
        }

        System.out.printf("%-10s %-20s %-20s %-20s %-10s\n", "Ma sach", "Ten sach", "Ten tac gia", "Nha xuat ban", "Nam xuat ban");
        for (int i = 0; i < 5; i++) {
            sach[i].xuat();
        }
    }
}

