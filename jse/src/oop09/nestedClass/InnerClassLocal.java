package oop09.nestedClass;

/*
 * 내부클래스 의 두번째 형태
 * - Local 내부 클래스에서는 외부 클래스의 멤버를 접근하는데 있어서
 * - 제한이 따른다. 우선 외부 클래스의 멤버변수는  접근할 수 있다.
 * - 하지만 메서드 내부의 지역변수는 접근할 수 없다.
*/
public class InnerClassLocal {
	int a = 100;
	public void innerTest(int k){
		int b = 200;
		final int c = k;
		class Inner{  // 현재 이너 클래스의 아버지는 메소드 이다.
			public void getData(){
				System.out.println("멤버변수 a : " + a);
				System.out.println("상수 c : " + c);
				// System.out.println("지역변수 b : " + b); // 지역변수 b는 상수로 만들어야 출력이 가능하다. >> 멤변과, 상수만 출력 가능
			}
		}
		Inner inn = new Inner();
		inn.getData();
	}
}
