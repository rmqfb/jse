package oop01.encapsule;

import java.util.Scanner;

public class PayService {
	
	PayVO vo = new PayVO();

	public int calculateIncome(String name, int salary){
		vo.setName(name);
		vo.setSalary(salary);
		
		return (int)(vo.getSalary()*(1-vo.TAX));
	}

	public int showTax() {
		return (int)(vo.TAX*100);
	}	
}
