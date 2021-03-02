public class Choi extends Student {
    String number;
    public Choi(String name, int age,int id, String school, String num){
        this.name= name;
        this.age = age;
        this.id = id;
        this.school = school;
        this.number = num;
    }
    public static void main(String[] args) {
        Choi choi = new Choi("효민",4,0,"학교입니다","060229-3000000");
        choi.infoStudent();
    }
    @Override
    public void infoStudent() {
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("학번 : "+id);
        System.out.println("학교 : "+school );
        System.out.println("주민 번호 : "+number);
    }
}
