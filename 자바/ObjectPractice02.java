import java.util.ArrayList;
import java.util.Scanner;

public class ObjectPractice02 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<6;i++){
            if(i%2==0){
                System.out.printf("한 변의 길이 : ");
                int a = scanner.nextInt();
                arrayList.add(a);
            }
            if(i%2!=0){
                System.out.printf("이름 : ");
                String b = scanner.next();
                arrayList.add(b);
            }
        }
        for(int i=0;i<6;i++){
            if(i%2==0) {
                    System.out.println(arrayList.get(i+1) + " : " + (int)(arrayList.get(i))*((int)(arrayList.get(i)))+"cm2");
            }
        }
    }
}
