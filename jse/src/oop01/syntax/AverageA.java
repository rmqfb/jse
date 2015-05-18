package oop01.syntax;

public class AverageA {
	
	String name;
	int kor;
	int eng;

	
	public static void main(String[] args) {
		//tot, avg 지역변수 선언 후
		// 아래와 같이 출력!
		
		AverageA hulk = new AverageA();
		
		hulk.name = "헐크";
		hulk.kor = 100;
		hulk.eng = 90;
		int tot = hulk.kor + hulk.eng;
		double avg = (double)tot/2;

		// 헐크
		System.out.println("=== "+hulk.name+"의 성적표 ===");
		System.out.println("국어 : "+hulk.kor+"점");
		System.out.println("영어 : "+hulk.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
		
		
		//아이언
		AverageA iron = new AverageA();
		iron.name = "아이언맨";
		iron.kor = 100;
		iron.eng = 100;
		tot = iron.kor + iron.eng;
		avg = tot/2d;
		
		System.out.println("=== "+iron.name+"의 성적표 ===");
		System.out.println("국어 : "+iron.kor+"점");
		System.out.println("영어 : "+iron.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
		
		
		//토르
		AverageA thor = new AverageA();
		thor.name = "토르";
		thor.kor = 70;
		thor.eng = 97;
		tot = thor.kor + thor.eng;
		avg = tot/2.0;
		
		System.out.println("=== "+thor.name+"의 성적표 ===");
		System.out.println("국어 : "+thor.kor+"점");
		System.out.println("영어 : "+thor.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
	}
}
