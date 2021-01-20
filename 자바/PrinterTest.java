public class PrinterTest {
    public static void main(String[] args) {
    Printer p = new Printer();
    p.numPapers = 100;
    p.print(70);
    }
}

class Printer{
    int numPapers = 0;

    void print(int amount){
        System.out.println(amount + "장 출력");
        numPapers -= amount;
        System.out.println(numPapers + "장 남았습니다.");
    }
}