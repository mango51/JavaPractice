public class VStudent {
    private String major;
    private String name;
    private int age;
    private double height;

    public VStudent(){

    }

    public void setMajor(String major){
        this.major= major;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getMajor(){
        return this.major;
    }
    public int getAge(){
        return this.age;
    }
    public double getHeight(){
        return this.height;
    }

    public static void main(String[] args) {
        VStudent hong = new VStudent();
        VStudent seong = new VStudent();

        hong.setName("홍길동");
        seong.setName("성춘향");

        hong.setAge(20);
        seong.setAge(18);

        hong.setMajor("컴공");
        seong.setMajor(null);

        hong.setHeight(178.5);
        seong.setHeight(160.7);

        System.out.println(seong.major);
    }
}
