import java.io.PrintStream;
import java.util.Scanner;

public class Prob03 {

    final static double PI = 3.14;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("원기둥의 밑면 반지름은? ");
        int r = in.nextInt();
        System.out.print("원기둥의 높이는? ");
        int h = in.nextInt();
        PrintStream printf = System.out.printf("원기둥의 부피는 %.1f", r * r * h* PI);
    }
}


