import java.util.Scanner;

public class ThreeFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            if(a<0){
                throw new MinusException();
            }
            int b=0;
            for(int i=1;i<=a;i++){
                if(i%3==0|i%5==0){
                    b+=i;
                }
            }
            System.out.println("Result : "+b);
        }catch(MinusException e){
            e.printStackTrace();
        }
    }
}
