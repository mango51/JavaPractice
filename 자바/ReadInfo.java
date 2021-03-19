import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디 : ");
        String userId = scanner.next();
        System.out.println("비밀번호 : ");
        String userPw = scanner.next();
        File file = new File("src/FileInfo");
        try {
            Scanner sc = new Scanner(file);
            // file 내용 입력해서 받아오는 sc
            boolean loginSuccess = false;
            // 로그인 성공 여부 나타내 주는 변수
            // true이면 로그인 성공, false이면 로그인 실패

            while(sc.hasNext()) {
                // Scanner인 sc로 파일 내용 불러올 때, 파일 내용이 있는 한 계속 실행
                // 파일 내용을 다 불러왔으면 끝남
                // = 파일 끝까지 읽어올 수 있음

                // file 내용을 sc로 입력받기
                String id_infor = sc.next();
                String pw_infor = sc.next();
                String name_infor = sc.next();
                int age_infor = sc.nextInt();
                // 순서대로 file내용을 sc에 입력받기
                // id->pw->name->age로 순서대로 file내용 띄어쓰기 기준으로 입력받기
                // 파일 내용 순서와 코드로 불러오는 sc의 순서 일치해야함
                // 쓰지 않는 정보 읽어오는 건 비효율적일 수 있지만 Scanner는 순서대로 읽어오기 때문에 어쩔 수 없이 원하지 않는 정보까지 읽어옴
                if (userId.equals(id_infor) && userPw.equals(pw_infor)) {
                    //사용자가 입력한 userId와 파일에 있는 id_infor가 같으면
                    loginSuccess = true;
                    // 기본값이 false인 loginSuccess가 true로 변함
                }
            } // 여기에 괄호 넣어야 파일 내용 한 바퀴 돌 때 만약 아이디와 비번 일치한 적이 한 번이라도 있으면 loginSuccess가 true로 되어서
            // 밑에 true일 경우 입력한 아이디 userId님을 환영한다는 말 출력함
                if(loginSuccess) System.out.println(userId+"님 환영합니다.");
                // if(true)이면 로그인 성공했다는 말 출력
                else System.out.println("로그인에 실패하셨습니다.");
                // 아니면 로그인 실패했다는 말 출력
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
