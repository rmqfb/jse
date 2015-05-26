package oop09.nestedClass;

/*
 * 내부클래스(Inner class) 첫번째 형태.
 * - 인스턴스 내부 클래스
 * - 멤버메소드를 클래스 내부에 선언함.
*/
public class InnerClassInstance {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public class Inner{  // 지금 여기 있는 이너 클래스의 아버지는 클래스 이기때문에 클래스(멤버) 변수이다. 서로가 스태틱이 아니니까 같이 움직인다.
		public void printData(){
			System.out.println("멤버변수 a : " + a);
			System.out.println("프라이빗변수 b : " + b);
			System.out.println("스태틱변수 c : " + c);
		}
	}
}
