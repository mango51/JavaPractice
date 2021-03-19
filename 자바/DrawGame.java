import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DrawGame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("인원 수 입력 : ");
        int num = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for(int i=0;i<num;i++){
            System.out.printf("사용자"+ (i+1) +" 이름 : ");
            String name = scanner.next();
            arrayList.add(name);
        }
        for(int i=0;i<num;i++){
            System.out.printf("항목"+(i+1)+" 이름 : ");
            String kind = scanner.next();
            arrayList2.add(kind);
        }
        Collections.shuffle(arrayList);
        Collections.shuffle(arrayList2);
        System.out.println("\n 1. 전체 결과 확인   2. 개인 결과 확인");
        int choice = scanner.nextInt();
        if(choice==1){
            for(int i=0;i<num;i++){
                System.out.println(arrayList.get(i)+" : "+ arrayList2.get(i));
            }
        }
        else if(choice ==2){
            System.out.printf("사용자 이름 : ");
            String findName = scanner.next();
            for(int i=0;i<num;i++){
                if(findName.equals(arrayList.get(i))){
                    System.out.println(findName+"의 항목은 "+arrayList2.get(i));
                }
                else if(arrayList.contains(findName)==false){
                    System.out.println("해당 사용자는 결과에 없습니다.");
                }
            }
        }
    }
}
