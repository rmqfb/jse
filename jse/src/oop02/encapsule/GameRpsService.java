package oop02.encapsule;
/*
 * Date : 2015.05.15
 * Author : 킴요!
 * Description : 가위, 바위, 보 게임놀이 
 * 1은 가위, 2는 바위, 3은 보
 */ 
public class GameRpsService {
	/*
	 * 숫자 값에 따른 가위,바위,보 결정 로직
	 */
	public String showRpsValue(int playervalue) {
		String result = "";
		switch (playervalue) {
		case 1:  result = "가위"; break;
		case 2: result = "바위"; break;
		case 3: result = "보"; break;
		default: result = "다시 입력하세요"; break;
		}
		return result;
	}

	/*
	 * 컴퓨터가 랜덤으로 발생시킨 수 1~3까지
	 */
	public int displayComValue() {
		int comValue = (int)(Math.random()*3)+1;
		return comValue;
	}
	
	/*
	 * 승자를 보여주는 로직
	 */
	public String showWinner() {
		
		return null;
	}

	
}
