package oop05.polymorphism;

import java.util.Scanner;



public class NumberMatchMain {
	public static void main(String[] args) {
		
		NumberMatchService nms = new NumberMatchServiceImpl();
		
		System.out.println("0~1사이의 번호를 입력하세요.\n");
		Scanner scanner = new Scanner(System.in);
		int playVal = scanner.nextInt();
		int comVal = nms.makeComVal();
		System.out.println("컴퓨터 값 : " + comVal);
		nms.match(playVal, comVal);
		
		
		System.out.println(nms.display());
	}
}
