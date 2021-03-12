import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordArr[] = new String[10];
        for(int i=0;i<10;i++){
            System.out.printf("문제로 출제할 영어 단어를 입력해주세요 : ");
            String word = scanner.next();
            wordArr[i]=word;
        }
        Random random = new Random();
        int num = random.nextInt(10);
        String answer = wordArr[num];
        System.out.println();
        System.out.println("----------------------------------");
        ArrayList<String> arrayList = new ArrayList<>();
        String[] splitanswer= answer.split("");
        String[] answerBlank = new String[answer.length()];
        for(int i=0;i<answer.length();i++){
            answerBlank[i]="_ ";
        }
        for(int i=5;i>=0;i--){
            if(Arrays.equals(answerBlank,splitanswer)){
                //answerBlank.equals(splitanswer)는 answerBlank==splitanswer와 같은 뜻
                // 즉, 두 배열이 같은 객체인지를 비교하는 것 (동일한 배열 형식의 객체인지)
                // 하지만 이와 다르게 Arrays를 사용하여 두 배열 안의 내용 같은지 비교
                //Arrays.equals(answerBlank,splitanswer)는 두 배열의 내용물들이 같은지 비교
                System.out.println("축하합니다!");
                System.out.println(answer+"가 맞습니다!");
                System.exit(0);
            }
            System.out.println();
            System.out.println("남은 기회 : "+i);
            System.out.println("현재까지 입력된 단어");
            for(int j=0;j<arrayList.size();j++){
                System.out.printf(arrayList.get(j));
            }
            System.out.println();
            System.out.println("남은 단어");
            for(int j = 0;j<answerBlank.length;j++){
                System.out.printf(answerBlank[j]);
            }
            System.out.println();
            System.out.printf("글자를 입력하세요 : ");
            String letter = scanner.next();
            for(int j=0;j<splitanswer.length;j++){
                if(splitanswer[j].contains(letter)){
                    answerBlank[j]=letter;
                }
                if(!answer.contains(letter)){
                    arrayList.add(letter);
                    break;
                }
            }
            for(int j=0;j<splitanswer.length;j++){
                if(splitanswer[j].contains(letter)){
                    i++;
                    break;
                }
            }
        }
        if((Arrays.equals(answerBlank,splitanswer))==false){
            //Arrays 클래스를 사용하여 배열들 안의 내용들을 비교하는 기능 사용하기
            //Arrays.equals(배열1, 배열2)로 배열 안의 내용 비교해서 같으면 true 반환
            System.out.println("정답은 "+answer);
        }
    }
}
