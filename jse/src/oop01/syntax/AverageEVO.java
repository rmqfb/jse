package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	// getter setter 를 사용하지 않고, 생성자로 처리
	// 단, avg(), tot() 메소드는 작성
	
	public AverageEVO(){} // 다른 생성자를 만들어 놨을땐, 기본 생성자를 만들어주는 게 매너^^
	
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
