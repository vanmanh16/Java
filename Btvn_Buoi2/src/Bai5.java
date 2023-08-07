import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số quả chanh (a): ");
        int a = scanner.nextInt();

        System.out.print("Nhập số quả táo (b): ");
        int b = scanner.nextInt();

        System.out.print("Nhập số quả lê (c): ");
        int c = scanner.nextInt();
        int x = findMaxChanh(a, b, c);
        if (x == 0) {
            System.out.println("Tèo không thể nấu món Siro này vì không đủ nguyên liệu yêu cầu!");
        } else {
            System.out.println("Tổng số quả tối đa là: " + x * 7 + " (Chanh: " + x + ", Táo: " + x * 2 + ", Lê: " + x * 4 + ")");
        }
    }

    private static int findMaxChanh(int a, int b, int c) {
        if (a * 2 > b || a * 4 > c) {
            return (findMaxChanh(a - 1, b, c));
        } else {
            return a;
        }

    }
}