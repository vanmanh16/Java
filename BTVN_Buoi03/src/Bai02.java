import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        add(scanner, arr, n);
    }
    public static void add(Scanner scanner, int[] arr, int n){
        System.out.print("Nhập vị trí cần thêm: ");
        int x = scanner.nextInt();
        if (x < 0 || x > n) {
            System.out.println("Vị trí khôn hợp lệ!");
            return;
        }
        System.out.print("Nhập giá trị cần thêm: ");
        int value = scanner.nextInt();
        int[] newArr = new int[n + 1];
        for (int i = 0; i < x; i++) {
            newArr[i] = arr[i];
        }
        newArr[x] = value;
        for (int i = x + 1; i < n + 1; i++) {
            newArr[i] = arr[i - 1];
        }
        System.out.println("Mảng sau khi thêm:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
