package oop05.polymorphism;

import java.util.Scanner;

public class RpsMain {
	public static void main(String[] args) {
		
		RpsService rs = new RpsServiceImpl();
		
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("1.���� 2.���� 3.���ڱ� �� �Է��ϼ���.");		
		Scanner scanner = new Scanner(System.in);
		int playerVal = scanner.nextInt();
		

		System.out.println("�÷��̾�� "+ rs.showRpsVal(playerVal) +"�� �½��ϴ�.");
		int comVal = rs.displayComVal();
		
		System.out.println("��ǻ�ʹ� "+ rs.showRpsVal(comVal) +"�� �½��ϴ�.");
		String winner = rs.showWinner(playerVal,comVal);
		System.out.println(winner);
		scanner.close();
	}
	
}
