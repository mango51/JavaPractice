import java.util.Random;
import java.util.Scanner;

public class BattleGame {
    public static void main(String[] args) {
        System.out.printf("사용자 닉네임을 입력하세요 : ");
        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();
        System.out.println("설정되었습니다!");
        System.out.println("야생의 몬스터가 나타났다!");
        System.out.println();
        System.out.println("----------------------------------");
        int count =1;
        int knight = 100;
        int monster=100;
        int left = 3;
        int monLeft=3;
        while(true) {
            Random random = new Random();
            int randomNum = random.nextInt(2)+1;
            System.out.println("현재 턴 수 : "+count);
            count++;
            int damageToMonster=20;
            int damageToKnight=10;
            int recovery = 15;
            System.out.println("*** "+name+"의 체력 : "+knight+" ***\n*** 몬스터의 체력 : "+monster+" ***\n*** 남은 회복 가능 횟수 : "+left+" ***");
            System.out.println("---------------------------------");
            System.out.println("1. 공격한다.   2. 방어한다.   3. 회복한다.");
            System.out.println("---------------------------------");
            System.out.printf("무엇을 할까요? : ");
            int num = scanner.nextInt();
            if(num==1){
                System.out.println(name+"의 공격!\n 몬스터에게 "+damageToMonster+"의 데미지를 입혔다.");
            }
            else if(num==2){
                System.out.println(name+"의 방어!\n"+name+"은(는) 방어태세에 들어갔다.");
            }
            else if(num==3){
                if(left>0&knight<=100) {
                    System.out.println(name + "은(는) 회복 주문을 사용했다.\n" + name + "의 체력이 회복되었다.");
                    knight+=recovery;
                    if(knight>100){
                        knight=100;
                    }
                    left--;
                }
                else if(left<=0){
                    System.out.println("회복 횟수가 0입니다.");
                    count--;
                    continue;
                }
            }
            if(randomNum==1) {
                System.out.println("몬스터의 공격!\n");
                if(num==1) {
                    System.out.println(name + "은 " + damageToKnight + "의 데미지를 입었다.");
                    System.out.println("몬스터에게 "+damageToMonster+"의 데미지를 입혔다.");
                    knight-=damageToKnight;
                    monster-=damageToMonster;
                }
                else if(num==2|num==3){
                    System.out.println("하지만 "+name+"은(는) 공격을 방어했다!");
                }
            }
            else if(randomNum==2){
                System.out.println("몬스터의 방어! \n몬스터는 방어태세에 들어갔다.");
                if(num==1){
                    System.out.println("몬스터가 "+name+"의 공격을 방어했다!");
                }
            }
            else if(randomNum==3){
                if(monLeft>0&monster<50) {
                    System.out.println("몬스터는 회복 주문을 사용했다.\n몬스터의 체력이 회복되었다.");
                    monLeft--;
                    monster+=recovery;
                }
                else if(monLeft<=0){
                    randomNum = random.nextInt(1)+1;
                    if(randomNum==1) {
                        System.out.println("몬스터의 공격!\n");
                        if(num==1) {
                            System.out.println(name + "은 " + damageToKnight + "의 데미지를 입었다.");
                            knight-=damageToKnight;
                            monster-=damageToMonster;
                        }
                        else if(num==2|num==3){
                            System.out.println("하지만 "+name+"은(는) 공격을 방어했다!");
                        }
                    }
                    else if(randomNum==2){
                        System.out.println("몬스터의 방어! \n몬스터는 방어태세에 들어갔다.");
                        if(num==1){
                            System.out.println("몬스터가 "+name+"의 공격을 방어했다!");
                        }
                    }
                }
            }
            while(randomNum==2&num==1){
                randomNum = random.nextInt(2)+1;
                System.out.println();
                System.out.println("방어한 몬스터가 먼저 기회 갖게됨");
                System.out.println();
                System.out.println("*** "+name+"의 체력 : "+knight+" ***\n*** 몬스터의 체력 : "+monster+" ***\n*** 남은 회복 가능 횟수 : "+left+" ***");
                System.out.println("---------------------------------");
                System.out.println("1. 공격한다.   2. 방어한다.   3. 회복한다.");
                System.out.println("---------------------------------");
                System.out.printf("무엇을 할까요? : ");
                num = scanner.nextInt();
                if(randomNum==1) {
                    System.out.println("몬스터의 공격!\n");
                }
                else if(randomNum==2|randomNum==3){
                    System.out.println("몬스터의 방어! \n몬스터는 방어태세에 들어갔다.");
                }
                if(randomNum==3){
                    if(monLeft>0&monster<50) {
                        System.out.println("몬스터는 회복 주문을 사용했다.\n몬스터의 체력이 회복되었다.");
                        monLeft--;
                        monster+=recovery;
                    }
                }
                if(num==1){
                    if(randomNum==1) {
                        System.out.println(name + "은 " + damageToKnight + "의 데미지를 입었다.");
                        System.out.println(name + "의 공격!\n 몬스터에게 " + damageToMonster + "의 데미지를 입혔다.");
                        knight-=damageToKnight;
                        monster-=damageToMonster;
                    }
                    else if(randomNum==2|randomNum==3){
                        System.out.println("하지만 몬스터가 "+name+"의 공격을 방어했다!");
                    }
                }
                else if(num==2){
                    System.out.println(name+"의 방어!\n"+name+"은(는) 방어태세에 들어갔다.");
                    if(randomNum==1){
                        System.out.println("하지만 "+name+"가 몬스터의 공격을 방어했다!");
                    }
                }
                else if(num==3){
                    if(left>0&knight<=100) {
                        System.out.println(name + "은(는) 회복 주문을 사용했다.\n" + name + "의 체력이 회복되었다.");
                        knight+=recovery;
                        if(knight>100){
                            knight=100;
                        }
                    }
                }
            }
            if(knight<=0){
                System.out.println("몬스터 승!");
                System.exit(0);
            }
            else if(monster<=0){
                System.out.println(name+"님 승!");
                System.exit(0);
            }
        }
    }
}
