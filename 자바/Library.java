import java.util.Scanner;
import java.util.Vector;

public class Library {
    Vector<String> novelList;
    String name;
    String libraryName;
    String location;

    public Library(){
        novelList = new Vector<String>();
        name = "사서 이름 변경 전 상태";
        libraryName = "반도";
        location = "반포";
    }
    public void addBook(String novel){
        novelList.add(novel);
    }
    public void showBook(){
        System.out.println(novelList);
    }
    public void changeName(String name){
        System.out.println("변경 전 사서 이름 : "+this.name);
        this.name = name;
        System.out.println("변경된 사서 이름 : "+name);
    }
    public void showInfo(){
        System.out.println("도서관 이름과 장소 : "+libraryName+", "+location);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library lib = new Library();
        lib.addBook("자료구조");
        lib.addBook("데이터베이스");
        lib.addBook("알고리즘");
        lib.showBook();
        lib.changeName("컴공 사서");
        lib.showInfo();
    }
}
