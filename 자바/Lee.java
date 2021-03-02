public class Lee extends Student {
    public Lee(String name, int age,int id, String school){
        this.name= name;
        this.age = age;
        this.id = id;
        this.school = school;
    }
    public static void main(String[] args) {
        Lee lee = new Lee("안녕하세요",2,20,"학교");
        lee.infoStudent();
    }
    @Override
    public void infoStudent() {
        System.out.println("Lee");
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("학번 : "+id);
        System.out.println("학교 : "+school );
    }
}
