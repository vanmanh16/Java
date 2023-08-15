import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        count(arr);
    }

    public static void count(int[] arr) {
        int[] count = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count[i]++;
                }
            }
        }
        System.out.println("Số lần xuất hiện của từng phần tử trong mảng:");
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(arr[i] + " xuất hiện " + count[i] + " lần");
            }
        }
    }
}