public class exam01 {
	public static void main(String args[]) {
		//car.java와 automobile.java 함께 사용하는 코드
		//car클래스와 automobile클래스 사용하여 실행하는 메인 함수 코드
		car myCar1 = new car();
		myCar1.color = "Red";
		myCar1.speed = 100;

		car myCar2 = new car();
		myCar2.color = "Blue";
		myCar2.speed = 100;
		
		automobile myCar3 = new automobile("Green",50,3);
		System.out.println("Speed of myCar3 : "+myCar3.getSpeed());

		myCar1.upSpeed(50);
		System.out.println("Color of myCar1: " 
				+ myCar1.getColor() + ", Speed of myCar1: "
				+ myCar1.getSpeed() + "km/h");

		myCar2.downSpeed(20);
		System.out.println("Color of myCar2: " 
				+ myCar2.getColor() + ", Speed of myCar2: "
				+ myCar2.getSpeed() + "km/h");
		
		myCar2.upSpeed(200);
		myCar3.upSpeed(200);

		System.out.println("Color of myCar3 : "+myCar3.color+", New Seat Number : "+myCar3.getSeatNum());
		
		System.out.println("Speed of myCar2: " + myCar2.getSpeed() + "km/h");
		System.out.println("Speed of myCar3: " + myCar3.getSpeed() + "km/h");
	}
}