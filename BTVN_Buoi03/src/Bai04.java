import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str = scanner.nextLine();
        if (kt(str)) {
            System.out.println(str + " là chuỗi đối xứng");
        } else {
            System.out.println(str + " không phải là chuỗi đối xứng");
        }
    }

    public static boolean kt(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}