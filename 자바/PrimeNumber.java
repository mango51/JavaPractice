import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("검사할 숫자를 입력하세요 : ");
        int a = scanner.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            int count2=0;
            for(int j=1;j<i+1;j++){
                if(i%j==0) {
                    count2++;
                }
            }
            if(count2==2){
                count++;
            }
        }
        System.out.println("Result : "+count+"개");
    }
}
