public class automobile extends car{
	//클래스 car 상속함
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	void upSpeed(int value) {
		if (speed + value >= 300)
			speed = 300;
		else
			speed = speed + value;
	}
	automobile(String color, int vel, int seat){
		this.seatNum = seat;
		this.speed = vel;
		this.color = color;
	}
}
