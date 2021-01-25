import java.util.Scanner;

public class ForScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("횟수를 입력하세요. ");
        int a = scanner.nextInt();
        for (int i =0;i<a;i++){
            System.out.println("안녕");
        }
    }
}
