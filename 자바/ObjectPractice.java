import java.util.Vector;

public class ObjectPractice {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<Object>();
        int rad = 17;
        String name = "Circle";
        double pi =  3.141592;
        vector.add(rad);
        vector.add(name);
        vector.add(pi);
        double result = ((double)(vector.get(0)))*((double)(vector.get(0)))*pi;
        //vector.get(0)은 Object형이라서 double로 저장하려면 (double)을 통해 double형으로 만들어주고 계산하기
        System.out.println("Circle Area : "+result);
    }
}
