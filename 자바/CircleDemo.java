public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 5);
        Circle c2 = new Circle("blue", 6);

        System.out.println(c1.whosBigger(c2));
        System.out.println(c1.isSame(c2));      // c2 인수가 Circle 타입
    }
}

class Circle {
        String color;
        double radius;

    public Circle(String color, double radius) {    // 생성자 생성
        this.color = color;
        this.radius = radius;
    }

    double findArea(){
        return 3.14 * radius * radius;
    }

    Circle whosBigger (Circle c)    {
        return radius >= c.radius ? this : c;
    }

    boolean isSame(Circle c){
        if(this == c)
        return true;
        else
            return false;
    }

    @Override       // alt + enter를 눌러 toString 사용
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}