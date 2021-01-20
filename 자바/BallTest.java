public class BallTest {
    public static void main(String[] args) {
        Circle c= new Circle();
        Ball b = new Ball();

        c.findArea();
        b.findArea();       // class Circle로 부터 물려받은 class Ball! >> 메서드 findArea를 물려받음!
        b.findVolume();
        c=b;
        c.findArea();       // 위에 c=b;를 설정했기 때문에 b로 이동해서 Override함! >> 자식 클래스로 이동
    }
}

class Circle{       // = class Circle extends Object{ >> 모든 class는 Object가 부모! (부모로 부터 물려받음)
    // >> 당연해서 안 쓰는 것~!
    void findArea(){     //public을 사용해서 최대한 공개 범위를 넓힘
        // >> 부모 자식이 public 사용하지 않아도 자식 클래스에서 넓힐 수 있음
        // 부모는 public 쓰면 자식도 무조건 public사용해야함
        // 부모가 public 안 써도 자식은 사용 가능! >> 밑에서 범위 더 넓힐 수 있음!



        // ***super는 부모 클래스를 호출!!하는 방법!
        System.out.println("pi * r * r");
    }
}

class Ball extends Circle{          // findArea 물려받음 (상속받음)

    @Override           // 상속 받은 findArea의 메서드를 Override하다... (alt + insert)
                        // >>> 상속 받은 메서드 findArea를 넘겨라, 사용하지 않는다
                        // 자식이 부모한테서 상속 받은 것을 수정해서 사용하지 않음
                        // 부모 클래스 > 자식 클래스 == 부모 클래스는 자식으로부터 받지 않음!

    public void findArea() {        // Override사용하지 않으면 부모 클래스와 다른 findArea라는 메서드 설정됨
        System.out.println("공의 면적");
    }

    void findVolume(){
        System.out.println("3/4 * pi * r * r * r");
    }
}