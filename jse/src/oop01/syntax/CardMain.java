package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		
		
		
		System.out.println("ī�� ���� : " + CardVO.height);  // static ������ Ŭ���� ������ ���� ������ �����ϴ�.
		System.out.println("ī�� ���� : " + CardVO.width);
		
		// �ν��Ͻ� ���� �� �Ʒ� ���ó�� ��µǵ��� �ϱ�
		
		CardVO player = new CardVO("��Ʈ",3);
		CardVO com = new CardVO("�����̽�",5);
		
		System.out.println("�÷��̾�� "+player.getKind()+" "+player.getNumber()+" �̰� "); 
		System.out.println("��ǻ�ʹ� " +com.toString()+" �� ��ǻ�Ͱ� �̰���ϴ�.");
		
		// heart, spade
	}
}
