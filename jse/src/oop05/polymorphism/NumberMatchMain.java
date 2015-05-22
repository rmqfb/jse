package oop05.polymorphism;

import java.util.Scanner;



public class NumberMatchMain {
	public static void main(String[] args) {
		
		NumberMatchService nms = new NumberMatchServiceImpl();
		
		System.out.println("0~1������ ��ȣ�� �Է��ϼ���.\n");
		Scanner scanner = new Scanner(System.in);
		int playVal = scanner.nextInt();
		int comVal = nms.makeComVal();
		System.out.println("��ǻ�� �� : " + comVal);
		nms.match(playVal, comVal);
		
		
		System.out.println(nms.display());
	}
}
