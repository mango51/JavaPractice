import java.util.Random;
import java.util.Scanner;

public class ThirtyOne {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("게임을 시작합니다!");
        while(i<=31){
            System.out.printf("부를 수를 입력하세요 : ");
            int a = scanner.nextInt();
            if(a<1||a>3){
                System.out.println("잘못 입력하셨습니다. 1~3 사이의 수를 입력해주세요.");
                continue;
            }
            else {
                for (int j = 0; j < a; j++) {
                    i++;
                    System.out.println(i);
                    if (i == 31) {
                        System.out.println("사용자 31!");
                        System.exit(0);
                    }
                }
            }
            System.out.println("컴퓨터의 숫자! ");
            int randomNumber = random.nextInt(2)+1;
            for(int j=0;j<randomNumber;j++){
                i++;
                System.out.println(i);
                if(i==31){
                    System.out.println("컴퓨터 31!");
                    System.exit(0);
                }
            }
        }
    }
}
