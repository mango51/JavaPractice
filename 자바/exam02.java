class cat{
	public void intro(){
		System.out.println("goyang-goyang");
	}
}

public class exam02 {

	public static void main(String[] args) {

		cat c1 = new cat() {
			public void intro(){
			   System.out.println("mung-mung");
			}
		};
		// cat c1 = new cat(){
		//		public void intro(){
		//			System.out.println("mung-mung");
		//		}
		//};
		// 위의 코드는 객체 생성시 클래스 내에서 원하는 기능만 조금 변경하기 위해서 사용
		// 오버로딩하는 방식임 >> 객체 생성시 클래스 내의 변수 혹은 함수 내용 변경해서 해당 객체만의 기능으로 만들어서 사용
		// 클래스 cat 기존에 있는 intro함수를 오버로딩하여 객체 c1 내용에서 수정해서 사용
		
		c1.intro();
		// 객체 c1에서만 수정한(오버로딩한) intro 함수 사용 >> mung-mung 출력
		
		cat c2 = new cat();
		// 객체 c2 생성하기
		c2.intro();
		// c2는 기존에 있는 intro함수 사용 (오버로딩한 것 없으니까)
		
		System.out.println("class name of c1:" + c1.getClass().getName()); //exam02 : c1의 클래스 이름
		System.out.println("class name of c2:" + c2.getClass().getName()); //cat : c2의 클래스 이름
	}
}

