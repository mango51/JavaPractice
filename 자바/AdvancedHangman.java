import java.util.Random;
import java.util.Scanner;

public class AdvancedHangman {
    public static void main(String[] args) {
        String[] words = { "chair", "cat", "cake", "sea", "rule", "you", "black", "way", "live", "pain", "site",
                "yes", "table", "sick", "dog", "angle", "corn", "raise", "chain", "can", "class" };
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int answernum = random.nextInt(words.length);
        String answer = words[answernum-1];
        String answerBlank="";
        for(int i=0;i<answer.length();i++){
            answerBlank+="_ ";
        }
        System.out.println(answerBlank);
        int count=0;
        for(int i=5;i>0;i--){
            String typeAnswer = scanner.next();
            if(typeAnswer.equals(answer)){
                System.out.println(count +"번만에 정답을 맞추셨습니다!");
                break;
            }
            else if(typeAnswer.length()==answer.length()){
                String[] splitAnswer = answer.split("");
                String[] splitTypeAnswer = typeAnswer.split("");
                int countS=0;
                int countB=0;
                for(int j=0;j<answer.length();j++){
                    if(splitAnswer[j]==splitTypeAnswer[j]){
                        countS++;
                    }
                    else if(answer.contains(splitTypeAnswer[j])){
                        countB++;
                    }
                }
                i++;
                System.out.println(countS+"S "+countB+"B");
            }
            else{
                System.out.println("글자 수를 맞게 해주세요");
            }
            count++;
            if((typeAnswer.equals(answer)==false)&&i==1){
                System.out.println("실패, 정답은 "+answer+"입니다.");
            }
        }
    }
}
