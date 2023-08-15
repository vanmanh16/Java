import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số n cần kiểm tra: ");
        int n = scanner.nextInt();
        boolean kt = true;
        if (n <= 1) {
            kt = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    kt = false;
                    break;
                }
            }
        }
        if (kt) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không là số nguyên tố");
        }
    }
}
