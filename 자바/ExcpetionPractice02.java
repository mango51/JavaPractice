import java.util.Scanner;
import java.util.Vector;

public class ExcpetionPractice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자의 갯수를 설정하세요 : ");
        int a = scanner.nextInt();
        Vector<String> vector= new Vector<>();
        System.out.printf(a+"개의 과일 이름을 입력하세요 : ");
        for (int i=0;i<=a;i++){
            String fruit = scanner.nextLine();
            vector.add(fruit);
        }
        System.out.printf("몇 번째 과일을 가져올까요? : ");
        int b = scanner.nextInt();
        System.out.println(vector.get(b));
    }
}
