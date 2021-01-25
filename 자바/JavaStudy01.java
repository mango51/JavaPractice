import java.util.Scanner;
// java.util 패키지 안에 Scanner 클래스 사용하기
public class JavaStudy01 {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        String name = "강효민";
        System.out.println(name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력해주세요 : ");
        //String testA = scanner.next();
        //next()는 공백 이전까지의 글자(문자열)만 읽어옴
        //System.out.println(testA);

        //String testB = scanner.nextLine();
        //System.out.println(testB);
        //nextLine()은 엔터 이전까지의 문자열만 읽어옴


        int number = scanner.nextInt(); // 입력하기
        System.out.println(number);
        //nextInt()는 정수 읽어옴
    }
}
