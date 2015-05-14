package oop01.game;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		
		KaupVO vo = new KaupVO();
		vo.setHeight(height);
		vo.setWeight(weight);
		vo.setIdx(weight, height);
		vo.setMsg("");
		System.out.println(vo.toString());
		System.out.println("완료");
	}
	
}
