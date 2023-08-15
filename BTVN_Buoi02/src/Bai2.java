import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong n");
        int n = scanner.nextInt();
        float sum = 1;
        for (int i = 2; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Sum = " + sum);
    }
}
