package oop02.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		
		// ���� >>  income = salary - tax;
		// PayVo : getter, setter
		// PayService : ������
		// PayController  >> main Ŭ���� ����  : ����¸� ����
		// �̸��� �޿��� �Է¹޾Ƽ�
		// ���� �� �� �ҵ��� ���ϴ� ����
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = scanner.nextLine();
		System.out.println("������ �Է��ϼ���.");
		int salary = scanner.nextInt();
		

		PayService service = new PayService();
		
		
		System.out.println("===== �޿����� =====");
		System.out.println("���� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("���� : " + service.showTax() + "%");
		System.out.println("�Ǽ��ɾ� : " + service.calculateIncome(name, salary));
		
		
	}
}
