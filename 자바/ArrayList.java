public class ArrayList {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i=4;i>=0;i--){
            arr[i] = i+1;
        }
        for(int i = 0; i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
