public class DebugTest {
    public static void main(String[] args) {
        int year = 2019;        //빨간점 = 중간점 = break point눌러서 Debug 'DebugTest' (shift + f9)
        // step over와 step into의 차이점       >> 메서드 안으로 들어가고 싶다 = step into
        //                                     >> 메서드 안으로 안 들어가려면 step over
        ++year;
        System.out.println(year++ + "년 새해 복 많이 받으세요!"); // console 누르면 최종 실행된거 보여줌
        //강제 debugging 종료하려면 맨 오른쪽 상단에 빨강색 네모를 누르면 강제종료
    }
}
