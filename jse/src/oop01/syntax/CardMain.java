package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		
		
		
		System.out.println("카드 높이 : " + CardVO.height);  // static 변수라서 클래스 명으로 직접 접근이 가능하다.
		System.out.println("카드 넓이 : " + CardVO.width);
		
		// 인스턴스 생성 후 아래 결과처럼 출력되도록 하기
		
		CardVO player = new CardVO("하트",3);
		CardVO com = new CardVO("스페이스",5);
		
		System.out.println("플레이어는 "+player.getKind()+" "+player.getNumber()+" 이고 "); 
		System.out.println("컴퓨터는 " +com.toString()+" 라서 컴퓨터가 이겼습니다.");
		
		// heart, spade
	}
}
