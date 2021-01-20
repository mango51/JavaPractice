// 6장 p248 2번

public class StudentTest {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("길동이", 22),
                new Student("황진이", 23, 100)
        };

        for(Person p : persons)
            p.show();
       // System.out.println(p.show()); >> 왜 오류??? >> void 타입의 show이기 때문에 return타입!
    }
}

class Person{
    private String name;        // HOME 키 사용해서 맨 왼쪽으로 이동동
    int age;

    public Person(String name, int age) {   //생성자 생성
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("Person("+ name + "," + age + ")");
    }
}

class Student extends Person{   //class Student extends Person로 하면 오류 >> 생성자가 없기 때문에 가난함

    private int hakbun;

    public Student(String name, int age, int hakbun) {
        super(name, age);       // (순서) 먼저 나와야함!!!
        this.hakbun = hakbun;
    }

    public int getHakbun() {
        return hakbun;
    }

    public void setHakbun(int hakbun) {
        this.hakbun = hakbun;
    }

    //뒤에 Student 구현 by 오버라이딩 사용해서!!! *****
}