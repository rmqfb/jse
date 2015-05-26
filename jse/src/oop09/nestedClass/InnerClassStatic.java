package oop09.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public static class Inner{ // 스태틱 클래스는 아우터 클래스랑 다른 저장공간에 있으므로, 각각 노는거라고....
		static int d = 1000;
		public void printData(){
			// System.out.println("멤변 a : " + a);  // 오류 : a를 static으로 변경
			// System.out.println("프라이빗 b : " + b); // 오류 :  클래스가 static이라서(static은 제일 먼저 저장공간에 올려버리기 때문에 다른 변수들은 불러올수가 없다) static 이 아닌 변수는 오류가 난다.
			// static은 각자 움직일수 있지만 local은 아우터클래스와 같이 움직인다. - 저장공간의 차이 때문인가...?  무조건 지역이 아니다.
			/*
			 * 
			 * 
			 * a 와 b 값이 에러가 나는 것은...
			 * static 내부클래스는 사실 더 이상의 내부클래스가 아니다.
			 * 또한 외부클래스를 거치지 않고도 접근할 수 있다.
			 * 따라서 top level class 라고 하여 최상위 클래스라 한다.
			 * 어쩔수 없이 내부클래스를 static 르로 선언해야 하는 경우가 있다.
			 * 그건 바로 내부 클래스의 멤버들 중 하나라도
			 * static 멤버가 있을 경우이다.
			*/
			System.out.println("스태틱 c : " + c);
			System.out.println("스태틱 d : " + d);
		}
	}
}
