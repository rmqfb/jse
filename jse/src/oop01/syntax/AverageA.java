package oop01.syntax;

public class AverageA {
	
	String name;
	int kor;
	int eng;

	
	public static void main(String[] args) {
		//tot, avg �������� ���� ��
		// �Ʒ��� ���� ���!
		
		AverageA hulk = new AverageA();
		
		hulk.name = "��ũ";
		hulk.kor = 100;
		hulk.eng = 90;
		int tot = hulk.kor + hulk.eng;
		double avg = (double)tot/2;

		// ��ũ
		System.out.println("=== "+hulk.name+"�� ����ǥ ===");
		System.out.println("���� : "+hulk.kor+"��");
		System.out.println("���� : "+hulk.eng+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
		
		
		//���̾�
		AverageA iron = new AverageA();
		iron.name = "���̾��";
		iron.kor = 100;
		iron.eng = 100;
		tot = iron.kor + iron.eng;
		avg = tot/2d;
		
		System.out.println("=== "+iron.name+"�� ����ǥ ===");
		System.out.println("���� : "+iron.kor+"��");
		System.out.println("���� : "+iron.eng+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
		
		
		//�丣
		AverageA thor = new AverageA();
		thor.name = "�丣";
		thor.kor = 70;
		thor.eng = 97;
		tot = thor.kor + thor.eng;
		avg = tot/2.0;
		
		System.out.println("=== "+thor.name+"�� ����ǥ ===");
		System.out.println("���� : "+thor.kor+"��");
		System.out.println("���� : "+thor.eng+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
	}
}
