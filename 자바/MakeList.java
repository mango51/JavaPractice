import java.util.ArrayList;
import java.util.Scanner;

public class MakeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        while(true) {
            System.out.println("명령어를 입력하세요 i/p/d/x :");
            String type = scanner.next();
            if(type.equals("i")) {
                System.out.printf("명단에 추가할 이름을 입력하세요 : ");
                String name = scanner.next();
                arrayList.add(name);
            }
            else if(type.equals("p")) {
                for (int j = 0; j < arrayList.size(); j++) {
                    System.out.println(arrayList.get(j));
                }
            }
            else if(type.equals("d")) {
                System.out.printf("명단에서 제거할 이름을 입력하세요 :");
                String name = scanner.next();
                if(arrayList.contains(name)) {
                    //동적 배열이 가능한 ArrayList로 선언한 배열 arrayList 안에 name 있는지 확인
                    //ArrayList 클래스의 기능 contains()사용하기
                    //contains()기능은 boolean형으로 리턴값 나옴
                    //name이 arrayList 안에 있으면 true라서 밑의 코드 실행
                    for (int j = 0; j < arrayList.size(); j++) {
                        //arrayList의 크기를 알 수 있는 size() 기능 사용 (ArrayList클래스 안의 기능 중 하나)
                        if(name.equals(arrayList.get(j))) {
                            //arrayList 배열 안에 있는 원소들을 확인하기 위해 index로 돌리다가 name과 동일한 원소 있으면...
                            arrayList.remove(j);
                            //arrayList 안에서 해당 인덱스 (name과 동일한 원소) remove()기능을 통해 지우기
                            //remove()기능은 ArrayList 클래스 안의 기능 중 하나
                        }
                    }
                    System.out.println(name + "목록에서 제거 완료");
                }
                else{
                    System.out.println("명단에 없는 이름입니다.");
                }
            }
            else if(type.equals("x")){
                break;
                //while문 나가기
            }
            else{
                System.out.println("올바른 명령어를 입력해주세요.");
            }
        }
    }
}
