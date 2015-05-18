package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	
	// 메소드를 여기에 정의
	// 메소드의 객체화 하기
	
	public int tot(){
		return kor+eng;
	}
	
	private double avg(){
		return tot()/2d;
	}
	
	public static void main(String[] args) {
		
		AverageB hulk = new AverageB();
		
		hulk.name = "헐크";
		hulk.kor = 100;
		hulk.eng = 99;
			
		System.out.println("=== "+hulk.name+"의 성적표 ===");
		System.out.println("국어 : "+hulk.kor+"점");
		System.out.println("영어 : "+hulk.eng+"점");
		System.out.println("총점 : "+hulk.tot()+"점");
		System.out.println("평균 : "+hulk.avg()+"점");
		System.out.println();
	}
}
