import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimeAttack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("시간(초 단위)을 입력하세요 : ");
        int a = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.print("게임 끝");
                System.exit(0);
            }
        };
        timer.schedule(task,a*1000);

        System.out.println(a+"초 동안 게임이 진행됩니다.");
        String[] words = {"apple","banana","cat","time","egg","game","zoo"};
        int num = random.nextInt(6);
        String first = words[num];
        System.out.println(first);
        while(true){
            int b = first.length();
            String name = scanner.next();
            String[] splitname = name.split("");
            String[] splitfirst = first.split("");
            if(splitname[0].equals(splitfirst[b-1])){
                first = name;
            }
            else{
                System.out.println("잘못입력하셨습니다");
                continue;
            }
        }


    }
}
