import java.util.Scanner;

public class Country {
    String countryName = "대한민국";
    int money = 1000;
    String continent = "아시아";
    String lang = "한글";
    String capital = "서울";

    public void changeValue(String countryName, int money, String continent, String lang, String capital){
        this.countryName = countryName;
        this.money = money;
        this.continent = continent;
        this.lang = lang;
        this.capital = capital;
        //this. 사용하여 전역변수 값을 입력값으로 바꿈
        //nara 변수 안에 있는 전역변수 값의 정보를 입력값으로 바꿔서 저장해놓음
    }

    public void showInfo(){
        System.out.println();
        System.out.println("입력 정보");
        System.out.println("나라 이름 : "+countryName);
        System.out.println("대륙 : "+continent);
        System.out.println("수도 : "+capital);
    }

    public void tripleMoney(){
        this.money = money*3;
        //nara 안에 있는 this.money = 입력한 값 (디폴트 값인 1000에서 입력한 값으로 바뀜)
        //nara 안에서 전역변수인 this.money = 1000이 입력된 값으로 변경되어 전역변수에 저장됨!
        //nara 변수에 저장된 정보 money(changeValue를 통해 원래 있던 전역변수 값에 입력한 값으로 대체하여 저장됨)를 3배 곱해 저장
        System.out.println();
        System.out.println("입력된 재화에서 3배 곱한 값");
        System.out.println("3배로 바뀐 재화 : "+money);
    }

    public static void main(String[] args) {
        Country nara = new Country();
        // nara 라는 Country 형태의 변수 생성
        Scanner scanner = new Scanner(System.in);
        System.out.printf("나라 이름 : ");
        String countryName = scanner.next();
        System.out.printf("재화 : ");
        int money = scanner.nextInt();
        System.out.printf("대륙 : ");
        String continent = scanner.next();
        System.out.printf("언어 : ");
        String lang = scanner.next();
        System.out.printf("수도 : ");
        String capital = scanner.next();
        nara.changeValue(countryName,money,continent,lang,capital);
        nara.showInfo();
        nara.tripleMoney();
    }
}
