package cmm03.flow;

import java.util.Scanner;



public class No03_SwitchCaseDemo {
	public static void main(String[] args) {
		//System.out.println("평균 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int avg=0;// = scanner.nextInt(); // next 는 커서 다음의 정수(int)를 입력 받아라
		String result = "";
		/*
		 * if(avg >= 70){
				result = "합격";
			}
		*/
		do{
			System.out.println("평균을 입력하세요");
			avg = scanner.nextInt();
		}while(avg<0 || avg>100);
		
		if(avg >= 70){
			result = "합격";
		}else{
			result = "재시험";
		}
		// 평균점수에 따라서 비교 학점구하기
		
		char grade = 'F';
		/*if(avg >= 90){grade='A';}
		else if(avg >= 80){grade='B';}
		else if(avg >= 70){grade='C';}
		else if(avg >= 60){grade='D';}
		else{grade = 'F';}*/
		
		// 위 if else 를 Switch 로 바꾸시오
		
		//System.out.println("귀하는 " + result + " 이며, 학점은 " + grade + " 입니다.");
		
		//int flog = avg/10;
		switch(avg/10){
		case 10 :
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F'; break;		
		}
		
		System.out.println("귀하는 " + result + " 이며, 학점은 " + grade + " 입니다.");

	}
}
