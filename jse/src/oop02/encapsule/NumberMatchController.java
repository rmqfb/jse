package oop02.encapsule;

import java.util.Scanner;

import cmm03.flow.No08_NumberMatchVO;

public class NumberMatchController {
	public static void main(String[] args) {
			
		NumberMatchService nms = new NumberMatchService();
		
		System.out.println("총 3회만 입력가능합니다.\n");
		Scanner scanner = new Scanner(System.in);
		
		int aa = scanner.nextInt();
		nms.formun(aa);

		
		
	}
}
