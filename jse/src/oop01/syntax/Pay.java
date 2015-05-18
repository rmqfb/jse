package oop01.syntax;

import java.util.Scanner;

public class Pay {

	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
		
		  Pay hulk = new Pay();
		  Pay iron = new Pay();
		  Pay thor = new Pay();
		  
		  hulk.name = "헐크";
		  hulk.salary = (int)(300*(1-hulk.TAX));
		  
		  iron.name = "아이언맨";
		  iron.salary = (int)(500*(1-iron.TAX));
		  
		  thor.name = "토르";
		  thor.salary = (int)(100*(1-thor.TAX));
		  
		  System.out.println("==="+hulk.name+"의 5월달 실급여는 "+hulk.salary+"만원 입니다.");
		  System.out.println("==="+iron.name+"의 5월달 실급여는 "+iron.salary+"만원 입니다.");
		  System.out.println("==="+thor.name+"의 5월달 실급여는 "+thor.salary+"만원 입니다.");

		/*
		Pay pay = new Pay();
		
		pay.name = "헐크";
		pay.salary = (int)(300*(1-pay.TAX));
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+pay.salary+"만원 입니다.");
		
		pay.name = "아이언맨";
		pay.salary = (int)(500*(1-pay.TAX));
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+pay.salary+"만원 입니다.");
		
		pay.name = "토르";
		pay.salary = (int)(100*(1-pay.TAX));
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+pay.salary+"만원 입니다.");
		*/
		
	}
}
