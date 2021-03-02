public class UsingException {
    public static void main(String[] args) {
        try{
            int num = -2;
            if(num<0){
                throw new MinusException();
            }
        }catch (MinusException e){
            e.printStackTrace();
        }
    }
}
