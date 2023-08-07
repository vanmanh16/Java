import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap so c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình không có nghiệm thực.");
        } else if (delta == 0) {
            double x = Math.sqrt((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có hai nghiệm kép x = " + x + ", " + (-x));
        } else {
            double x1 = Math.sqrt((-b + Math.sqrt(delta)) / (2 * a));
            double x2 = -Math.sqrt((-b + Math.sqrt(delta)) / (2 * a));
            double x3 = Math.sqrt((-b - Math.sqrt(delta)) / (2 * a));
            double x4 = -Math.sqrt((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh: " + a + "x^4 - " + b + "x^2 + " + c + " = 0 co cac nghiem la:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("x3 = " + x3);
            System.out.println("x4 = " + x4);
        }
    }
}
