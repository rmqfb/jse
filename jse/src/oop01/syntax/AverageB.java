package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	
	// �޼ҵ带 ���⿡ ����
	// �޼ҵ��� ��üȭ �ϱ�
	
	public int tot(){
		return kor+eng;
	}
	
	private double avg(){
		return tot()/2d;
	}
	
	public static void main(String[] args) {
		
		AverageB hulk = new AverageB();
		
		hulk.name = "��ũ";
		hulk.kor = 100;
		hulk.eng = 99;
			
		System.out.println("=== "+hulk.name+"�� ����ǥ ===");
		System.out.println("���� : "+hulk.kor+"��");
		System.out.println("���� : "+hulk.eng+"��");
		System.out.println("���� : "+hulk.tot()+"��");
		System.out.println("��� : "+hulk.avg()+"��");
		System.out.println();
	}
}
