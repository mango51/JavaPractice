public class BoxTest {
    public static void main(String[] args) {
        new BigBox();
    }
}

class Box{
    public Box(){
        System.out.println("Box");
    }
}

class BigBox extends Box{
    public BigBox(){
        System.out.println("Big Box");
    }
}

//class BigBox extends Box{
//    public BigBox(){
//        System.out.println("Big Box");
//    }
//}
            // >>> 위의 식과 달리 이렇게 되면 ( extends Box )
            // Big Box만 출력됨