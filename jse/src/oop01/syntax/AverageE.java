package oop01.syntax;

public class AverageE {
	public static void main(String[] args) {
		
		String name = "��ũ";
		int kor = 100;
		int eng = 80;
		AverageEVO vo = new AverageEVO(name, kor, eng);
		
		System.out.println("=== "+name+"�� ����ǥ ===");
		System.out.println("���� : "+kor+"��");
		System.out.println("���� : "+eng+"��");
		System.out.println("���� : "+vo.tot()+"��");
		System.out.println("��� : "+vo.avg()+"��");
		System.out.println();
	}
}
