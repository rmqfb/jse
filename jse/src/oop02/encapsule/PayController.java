package oop02.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		
		// 공식 >>  income = salary - tax;
		// PayVo : getter, setter
		// PayService : 계산로직
		// PayController  >> main 클래스 분할  : 입출력만 존재
		// 이름과 급여는 입력받아서
		// 세율 뺀 실 소득을 구하는 로직
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();
		System.out.println("본봉를 입력하세요.");
		int salary = scanner.nextInt();
		

		PayService service = new PayService();
		
		
		System.out.println("===== 급여내역 =====");
		System.out.println("성명 : " + name);
		System.out.println("본봉 : " + salary);
		System.out.println("세금 : " + service.showTax() + "%");
		System.out.println("실수령액 : " + service.calculateIncome(name, salary));
		
		
	}
}
