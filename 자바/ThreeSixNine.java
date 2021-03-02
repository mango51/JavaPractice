import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int count = 0;
        for(int i=1;i<a+1;i++){
            String makeString = Integer.toString(i);
            //i라는 숫자를 문자열로 변환한 makeString
            String[] result = makeString.split("");
            //문자열 makeString를 split해서 각각의 문자(문자로 인식되는 숫자)를 result 배열에 인덱스 하나하나에 넣기
            for(int j=0;j<result.length;j++) {
                //result 배열의 length만큼 for문으로 돌려서 인덱스 차례대로 문자 확인하기
                //각 문자(문자지만 숫자임)가 3,6,9인지 확인하고 맞으면 "짝" 출력하기 + 짝 개수에 추가
                if (result[j].equals("3")) {
                    System.out.printf("짝");
                    count++;
                }
                if (result[j].equals("6")) {
                    System.out.printf("짝");
                    count++;
                }
                if (result[j].equals("9")) {
                    System.out.printf("짝");
                    count++;
                }
            }
            if((makeString.contains("3")|makeString.contains("6")|makeString.contains("9"))==false){
                //makeString 문자열에 3,6,9라는 숫자가 포함되어있지 않으면 원래의 숫자 (문자열로 인식) makeString 출력하기
                System.out.printf(makeString);
            }
            System.out.println();
        }
        System.out.println(count+"번 박수");
    }
}
