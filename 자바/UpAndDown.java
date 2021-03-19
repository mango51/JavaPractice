import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(99)+1;
        System.out.println("숫자가 결정되었습니다.");
        for(int i=6;i>0;i--){
            System.out.printf("현재 남은 횟수 : "+i+"\n");
            System.out.println("-------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.printf("숫자를 입력하세요 : ");
            int guess=  scanner.nextInt();
            if((num>guess)&guess>0){
                System.out.println("UP");
            }
            else if(num<guess&(guess<101)){
                System.out.println("DOWN");
            }
            else if(num==guess){
                System.out.println("정답!");
                break;
            }
            else{
                System.out.println("1~100 사이입니다.");
            }
            if(num!=guess&i==1){
                System.out.println("정답은 "+num+"입니다");
            }
        }
    }
}


