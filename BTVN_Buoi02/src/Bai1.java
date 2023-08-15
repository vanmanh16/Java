import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n; y++) {
                if (i == 0 || i == n - 1 || y == 0 || y == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}