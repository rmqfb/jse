package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	// getter setter �� ������� �ʰ�, �����ڷ� ó��
	// ��, avg(), tot() �޼ҵ�� �ۼ�
	
	public AverageEVO(){} // �ٸ� �����ڸ� ����� ������, �⺻ �����ڸ� ������ִ� �� �ų�^^
	
	public AverageEVO(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	public int tot(){
		return this.kor+this.eng;
	}
	
	public double avg(){
		return tot()/2d;
	}
}
