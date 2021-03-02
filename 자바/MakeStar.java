import java.util.Scanner;

public class MakeStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i =0;i<a;i++){
            for(int j=0;j<i+1;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=a;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
