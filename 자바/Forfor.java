import java.util.Scanner;

public class Forfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. ");
        int a = scanner.nextInt();
        for (int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.println(i);
            }
        }
    }
}
