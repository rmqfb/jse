package oop01.syntax;

/*
 * 생성자는 인스턴스가 생성될 때
 * 호출되는 '인스턴스 초기화 메소드' 이다.
*/
class MilkCoffee{
	public MilkCoffee(){
		System.out.println("돈을 넣다");
	}
	public MilkCoffee(int money){
		this();
		System.out.println(money + "원");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		// this.setMoney(money);  취지에 맞지 않는... this. 메소드 해주는건 쓰지 않는게 좋대..
		System.out.println("구마가능여부 : " + (exist == true ? "커피종류선택" : "커피없음"));
	}
	public void setMoney(int money){
		
	}
}
public class CoffeeB {
	// 돈을 넣다
	// 500원
	// 구매가능여부 : 커피종류선택
	// 생성자를 한번만 쓰기
	public static void main(String[] args) {
		new MilkCoffee(500, true);
		// 인스턴스는 변하지 않는 주소값을 가진
		// 참조(레퍼런스) 변수이다.
	}
	
}
