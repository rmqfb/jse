package oop01.syntax;

public class AverageC {
	public static void main(String[] args) {
		
		AverageVO vo = new AverageVO();
		
		vo.setName("��ũ");
		vo.setKor(99);
		vo.setEng(60);
		
		System.out.println("=== "+vo.getName()+"�� ����ǥ ===");
		System.out.println("���� : "+vo.getKor()+"��");
		System.out.println("���� : "+vo.getEng()+"��");
		System.out.println("���� : "+vo.tot()+"��");
		System.out.println("��� : "+vo.avg()+"��");
		System.out.println();
	}
}
