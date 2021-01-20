import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        OddEven oe = new OddEven(10);   // 10번 던진다
        oe.input();
        oe.show();
        System.out.println(oe.find(1, 4));
    }
}
    class OddEven{
        int num;
        int odd, even;
        Scanner in;
        int[] data;     // [] 사이에는 num들어감 >> 몇번 하는지 = num

        public OddEven(int num) {       // alt + insert하면 바로 자동 생성자 생성
            this.num = num;
            in = new Scanner(System.in);
            data =new int[num];
        }

        void input() {      //***boolean일 경우 (i)
            int x;
            for (int i = 0; i < num; i++) { //ctrl + shift + enter : 가로 자동생성
                if((x = in.nextInt())%2==0)     //()를 %2까지 포함하면 짝수만 나옴
                    even ++;

                else        // 딱 두가지 경우가 아니라 else니까 나머지 경우들 다 합해서 말하는 거니까 okay
                    odd++;
                data[i] = x;
//                x = in.nextInt();
//                switch (x %2){
//                    case 0: even++; break;        //***(i) return true;
//                    case 1: odd++;               // return false; 로 하면 다른 case도 컴퓨터에서 있기 때문에 오류

                }
            }


        void show(){
            System.out.printf("홀수 개수 = %d, 짝수 개수 = %d\n", odd, even);
        }

        int find(int... x){ //... x가 한 개가 아니라 여러개
            int sum = 0;
            for (int a : data) {
                for (int j = 0; j < x.length; j++)
                if ( a == x[j] )
//                for(int b: x)       // 이 식도 가능하지만 전체를 처리하지 못한다!
//                    if(a == b)
                    sum ++;
            }
            return sum;
        }
    }

