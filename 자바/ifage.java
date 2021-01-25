import java.util.Scanner;

public class ifage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요. ");
        int a = scanner.nextInt();
        if ((a>=1)&(a<=7)){
            System.out.println("유아");
        }
        else if((a>=8)&(a<=13)){
            System.out.println("초등학생");
        }
        else if((a>=14)&(a<=16)){
            System.out.println("중학생");
        }
        else if((a>=17)&(a<=19)){
            System.out.println("고등학생");
        }
        else if(a>=20){
            System.out.println("성인");
        }
        else{
            System.out.println("잘못 입력하셨습니다. ");
        }
    }
}
