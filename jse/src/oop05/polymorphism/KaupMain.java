package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();
		
		KaupInterface ki = new KaupServiceImpl();
		ki.getKaupIndex(height, weight);
		
		
		System.out.println("ī�������� [Ű=" + height + "cm, ������=" + weight + "kg, ī��������="
		+ ki.getResultMsg() + "]");
		
		
	}
}
