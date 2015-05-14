package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo {
	int big;
	
	public void getBig(int a, int b, int c){
		if(a > b && a > c){
			System.out.println("가장 큰 수는 A값인 " + a + " 입니다.");
		}else if(b > a && b > c){
			System.out.println("가장 큰 수는 B값인 " + b + " 입니다.");
		}else{
			System.out.println("가장 큰 수는 C값인 " + c + " 입니다.");
		}
	}
	public static void main(String[] args) {  // static 은 저장공간이 다르고, 먼저 실행되니까 같은 클래스 안에 있어도 다른 메소드를 모른다. 그래서 클래스를 new메모리 해줘야 한다.
		No02_IfElseDemo instance = new No02_IfElseDemo();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A값을 입력하세요");
		int a = scan.nextInt();
		
		System.out.println("B값을 입력하세요");
		int b = scan.nextInt();
		
		System.out.println("C값을 입력하세요");
		int c = scan.nextInt();
		
		instance.getBig(a, b, c);
	}
}
