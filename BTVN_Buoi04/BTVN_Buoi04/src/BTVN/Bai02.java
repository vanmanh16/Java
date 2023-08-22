package BTVN;

import java.util.Scanner;

public class Bai02 {
    private float chieuDai;
    private float chieuRong;

    public Bai02() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public Bai02(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        this.chieuDai = scanner.nextFloat();
        System.out.print("Nhập chiều rộng: ");
        this.chieuRong = scanner.nextFloat();
    }

    public void veHCN() {
        for (int i = 0; i < (int) this.chieuRong; i++) {
            for (int j = 0; j < (int) this.chieuDai; j++) {
                if (i == 0 || i == (int) this.chieuRong - 1 || j == 0 || j == (int) this.chieuDai - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public double dienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public double chuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public static void main(String[] args) {
        Bai02 hcn = new Bai02();
        hcn.nhap();
        System.out.println("Diện tích hình chữ nhật: " + hcn.dienTich());
        System.out.println("Chu vi hình chữ nhật: " + hcn.chuVi());
        System.out.println("Hình chữ nhật:");
        hcn.veHCN();
    }
}

