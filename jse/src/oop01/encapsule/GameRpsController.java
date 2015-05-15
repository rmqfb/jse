package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {

		System.out.println("가위바위보 게임을 시작합니다");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.가위 2.바위 3.보");
		int playervalue = scanner.nextInt();
		
		GameRpsService service = new GameRpsService();		
		
		System.out.println("당신은" + service.showRpsValue(playervalue) +"을(를) 냈습니다.");
		
		int comvalue = service.displayComValue();
		String winner = service.showWinner();
		
		System.out.println("컴퓨터는" + service.showRpsValue(comvalue) + "을(를) 냈고, 결과는" + service.showWinner()  +"입니다.");
		
		
		GameRpsVO vo = new GameRpsVO();

		
		
	}
}
