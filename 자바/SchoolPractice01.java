public class SchoolPractice01 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int i=0;
        while(i<5){
            arr[i]=i*2+1;
            i++;
        }
        for(int j : arr){
            // 배열 arr에서 원소 처음부터 끝까지 하나씩 차례대로 가지고 나와서 int j에 대입하기
            System.out.print(j+" ");
        }
    }
}
