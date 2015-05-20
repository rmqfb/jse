package oop03.inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		// 일반적인 객체생성
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		
		// 부모 타입 = new 자식타입   // 부모의 메소드만 사용 가능
		Aclass a2 = new Bclass();  // a2 는 Bclass 를 바라보고 있고, Aclass 와 상속관계여야 하고, B클래스는 A클래스를 포함하고 있다  a2는 B클래스를 먼저 찾고 A를 그다음에 찾는다.
		// 오버라이딩시 자식클래스 메소드 우선 출력
		a2.over(1);
		// 오버라이딩 하지 않으면 부모클래스 우선 호출
		a2.noOver(1);
		// 부모클래스 타입을 자식클래스로 강제 형변환
		Bclass b2 = (Bclass)a2;
		b2.over(1);
		b2.noOver("AAA");
	}
}

class Aclass{
	void over(int i){
		System.out.println("Aclass-over() : " + (i*10));
	}
	void noOver(int i){
		System.out.println("Aclass-noOver() : " + i);
	}
}

class Bclass extends Aclass{
	public Bclass() {
		super.noOver(2);
	}
	void over(int i){
		System.out.println("Bclass-over() : " + (i*10000));
	}
	void noOver(String s){
		System.out.println("Bclass-noOver() : " + s);
	}
	void onlyB(){
		System.out.println("onlyB()");
	}
}
