import java.util.List;
import java.util.Vector;
import java.util.Scanner;

public class VectorPractice02 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<5;i++){
            String string = scanner.next();
            vector.add(string);
        }
        List<String> list = vector.subList(0,5);
        for (String i : list){
            System.out.println(i);
        }
    }
}
