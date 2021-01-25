import java.util.Scanner;

public class IfFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요.");
        int a = scanner.nextInt();
        if(a>=20){
            System.out.println("성인");
            if (a%2==0){
                System.out.println("나이가 짝수인 성인");
            }
            else {
                System.out.println("나이가 홀수인 성인");
            }
        }
        else if(a<20){
            System.out.println("미성년자");
            if (a%2==0){
                System.out.println("나이가 짝수인 미성년자");
            }
            else {
                System.out.println("나이가 홀수인 미성년자");
            }
        }
    }
}
