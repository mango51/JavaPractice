import java.util.Scanner;

public class ExceptionPractice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("크기를 설정하세요 : ");
        int a = scanner.nextInt();
        System.out.printf(a+"개의 정수를 입력하세요 : ");
        int[] arr=new int[a];
        for (int i=0;i<a;i++){
            try {
                arr[i] = scanner.nextInt();
                if (arr[i]<0){
                    throw new MinusException();
                }
            }catch (MinusException e){
                e.printStackTrace();
            }
        }
        int count = 0;
        for (int i = 0; i<a;i++){
            count+=arr[i];
        }
        System.out.println(count);
    }

}
