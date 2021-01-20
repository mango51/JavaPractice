
public class MaxDemo {
    public static void main(String[] args) {
        System.out.println(Max.max(7,5));
        System.out.println(Max.max(1.0,2.0));
        System.out.println(Max.max(3,9,5));

    }
}


class Max {     //static 사용하면 안됨! (기원전)
                // this는 기원후
    static int max(int a, int b){
        return a>= a? a:b;
    }
    static double max(double a, double b){  //static double max(int a, int b)는 가능
        //>> double형식으로 나옴 >> double이 int보다 크기 때문에!
        return a>= a? a:b;
    }
    static int max(int a, int b, int c){
        return max(max(a,b),c);
    }
}