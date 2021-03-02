import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a.equals("+")){
            System.out.println("Result : "+(b+c));
        }
        else if(a.equals("-")){
            System.out.println("Result : "+(b-c));
        }
        else if(a.equals("*")){
            System.out.println("Result : "+(b*c));
        }
        else if(a.equals("/")){
            System.out.println("Result : "+(b/c));
        }
        else{
            System.out.println("연산자 잘못 입력");
        }
    }
}
