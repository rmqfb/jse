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
		  
		  hulk.name = "��ũ";
		  hulk.salary = (int)(300*(1-hulk.TAX));
		  
		  iron.name = "���̾��";
		  iron.salary = (int)(500*(1-iron.TAX));
		  
		  thor.name = "�丣";
		  thor.salary = (int)(100*(1-thor.TAX));
		  
		  System.out.println("==="+hulk.name+"�� 5���� �Ǳ޿��� "+hulk.salary+"���� �Դϴ�.");
		  System.out.println("==="+iron.name+"�� 5���� �Ǳ޿��� "+iron.salary+"���� �Դϴ�.");
		  System.out.println("==="+thor.name+"�� 5���� �Ǳ޿��� "+thor.salary+"���� �Դϴ�.");

		/*
		Pay pay = new Pay();
		
		pay.name = "��ũ";
		pay.salary = (int)(300*(1-pay.TAX));
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+pay.salary+"���� �Դϴ�.");
		
		pay.name = "���̾��";
		pay.salary = (int)(500*(1-pay.TAX));
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+pay.salary+"���� �Դϴ�.");
		
		pay.name = "�丣";
		pay.salary = (int)(100*(1-pay.TAX));
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+pay.salary+"���� �Դϴ�.");
		*/
		
	}
}
