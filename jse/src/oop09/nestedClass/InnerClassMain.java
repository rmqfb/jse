package oop09.nestedClass;

/*
 * 내부클래스의 첫번째 형태
 * - 인스턴스 내부 클래스
 * - 멤버메소드를 클래스 내부에 선언함
*/
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
		// m.getInnerClassInstance();
		// m.getInnerClassLocal();  // 객체 new 한걸 메모리 에 점유하지 않기 위해, 메소드에서 객체 new 메모리 하고, 필요할때 메소드를 호출해서 객체?를 사용할수 있게... 메모리를 점유하지 않게끔 한다.
		// m.getInnerClassStatic_Inner();
		
		m.getInnerClassAnonyServiceImpl();
		
		
	}

	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
	}

	public void getInnerClassStatic_Inner() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner(); //클래스.생성자 로 바로 접근 / 아우터 클래스안에 이너 스태틱 클래스 접근 방법 / 얘는 객체가 아니라고?
		inn.printData(); // 이너 스태틱 안에 메소드에 접근
	}

	public void getInnerClassLocal() {  // static 을 제거  / 제거이유 : static 하면 메모리를 잡아먹기 때문에 빼준다.
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
	
	// alt + shift + m  >> 메소드 독립 단축키  >> 리펙토링

	public void getInnerClassInstance() { //static 를 제거
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();  // 아우터클래스의생성자.이너클래스의생성자 로 접근 / 아우터클래스.안에클래스 객체 = new 아우터클래스.new 안에클래스;
		inn.printData();
	}
}
