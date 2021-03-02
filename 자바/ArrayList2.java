import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i=0;i<5;i++) {
            System.out.print("문자를 입력하세요 : ");
            String a = scanner.next();
            arrayList.add(a);
        }
        for(Object i : arrayList){
            System.out.println(i);
        }
    }
}
