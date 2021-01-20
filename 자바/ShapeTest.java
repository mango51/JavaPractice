public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Circle();         // 부모의 크기> 자식의 크기 == 부모는 자식을 받아들일 수 있지만 반대는 안됨!
        // Shape s = new Circle();는 s를 가리키고 있는 것은 Circle (자식 객체)
        // = Shape라는 객체는 Circle이라는 객체를 가리키고있음 (관점이 Circle기준)
       // Circle c = new Shape ();        // 오류인 이유:
        s.show();
        Circle c1 = (Circle)s; // Circle (자식 객체) 기준에서 보고있음
        System.out.println(s.len);      // 메서드는 오버라이딩 되지만, 필드는 오버라이딩 됨.
        Circle c =new Circle();
        c.print();
    }
}                       // static는 멤버필드 사용할 때 쓴다.

class Shape {
    int len =5;

//    public Shape(){     //나 자신 = this라고 칭함, 부모님을 부를 때 = super라고 칭함!!!
//        this.len = len;                //***부모 생성자를 호출하는 방법 = super
//    }

//    public Shape(int len) {
//        this.len = len;
//    }         // >> 없어도... 알아서 인수가 없는 변수를 컴퓨터에서 컴파일

    public void show(){
        System.out.println(len);
    }
}
                    // * == ALL == 모든 거 끄집어내기 (중첩되지 않음)
class Circle extends Shape{         //자식이 Circle이고, 부모가 Shape (메서드 같음)
    int len = 10;

//    public Circle(int len) {        //자식 클래스를 실행하기 전에는 부모 클래스를 먼저 실행
//        super();
//        this.len = len;
//    }

    public void show(){            //public 범위가 더 넓어서
        System.out.println(len);
    }

    public void print(){
        System.out.println("print");            // 자식은 부모한테서 상속받고 수정할 수 있어서 자식은 메서드 print 사용가능
                                                // 하지만 부모는 자식의 메서드 print를 사용할 수 없음!!!
    }
}

// 자식 클래스는 부모 타임 안에 들어갈 수 있지만 반대는 안됨!
// >> 부모가 자식보다 크기 때문에
// 객체와 상관없는 타입 나오면 오류!
// static은 공유할 때 선언하기
