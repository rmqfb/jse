package oop02.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		RpsUtill utill = new RpsUtill();
		
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("1.���� 2.���� 3.���ڱ� �� �Է��ϼ���.");		
		Scanner scanner = new Scanner(System.in);
		int playerVal = scanner.nextInt();
		
		if( !(playerVal >= 1 && playerVal <=3)){
			System.out.println(utill.showRange(1, 3));
			scanner.close();
			return; // main ���� return ���� ���� ������ ���� ����
		}
		System.out.println("�÷��̾�� "+ service.showRpsVal(playerVal) +"�� �½��ϴ�.");
		int comVal = service.displayComVal();
		
		System.out.println("��ǻ�ʹ� "+ service.showRpsVal(comVal) +"�� �½��ϴ�.");
		String winner = service.showWinner(playerVal,comVal);
		System.out.println(winner);
		scanner.close();
	}
}
