import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        int age= scanner.nextInt();

        File file = new File("src/FileInfo");
        try {
            FileWriter fw =new FileWriter(file,true);
            fw.write(id+" "+pw+" "+name+" "+age+"\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
