public class MainPractice {
    public static void main(String[] args) {
        StudentPractice kim = new StudentPractice();
        StudentPractice lee = new StudentPractice();

        kim.setName("원하는 이름 1");
        lee.setName("원하는 이름 2");

        kim.showName();
        lee.showName();
    }
}
