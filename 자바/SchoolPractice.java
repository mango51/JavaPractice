import java.util.Random;

public class SchoolPractice {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(100);
        System.out.printf("점수는 "+score+"이므로 \n등급은 ");
        if(score >= 90){
            System.out.println("A");
        }
        else if(score>=80){
            System.out.println("B");
        }
        else if(score>=70){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
        int arr[] = new int[5];
        //5크기의 int형 배열 arr 선언
        System.out.println(arr.length);
        int arr2[] = {1,2,3};
        //1,2,3 원소를 넣은 int형 배열 arr2 선언
        System.out.println(arr2.length);
        arr[0]=2;
        arr[3]=9;
        for(int i : arr){
            System.out.print(i);
        }
    }
}
