package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {

		System.out.println("���������� ������ �����մϴ�");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.���� 2.���� 3.��");
		int playervalue = scanner.nextInt();
		
		GameRpsService service = new GameRpsService();		
		
		System.out.println("�����" + service.showRpsValue(playervalue) +"��(��) �½��ϴ�.");
		
		int comvalue = service.displayComValue();
		String winner = service.showWinner();
		
		System.out.println("��ǻ�ʹ�" + service.showRpsValue(comvalue) + "��(��) �°�, �����" + service.showWinner()  +"�Դϴ�.");
		
		
		GameRpsVO vo = new GameRpsVO();

		
		
	}
}
