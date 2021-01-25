import java.util.Scanner;

public class ForScannerOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int a = scanner.nextInt();
        for (int i=1;i<=a;i++){
            System.out.println(i);
        }
    }
}
