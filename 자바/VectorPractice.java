import java.util.Scanner;
import java.util.Vector;
import java.util.Scanner;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<7;i++){
            System.out.print("숫자를 입력하세요 : ");
            int num = scanner.nextInt();
            vector.add(num);
        }
        for(int i : vector){
            System.out.println(i);
        }
    }
}
