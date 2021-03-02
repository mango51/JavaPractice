public class Kim extends Student {
    public Kim(String name, int age,int id, String school){
        this.name= name;
        this.age = age;
        this.id = id;
        this.school = school;
    }
    public static void main(String[] args) {
        Kim kim = new Kim("강효민",24,201820829,"성신여대");
        kim.infoStudent();
    }

    @Override
    public void infoStudent() {
        System.out.println("Kim");
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("학번 : "+id);
        System.out.println("학교 : "+school );
    }
}
