package oop02.encapsule;

public class RpsService {

	// 컴퓨터가 랜덤으로 발생시킨 수 1~3까지
	public int displayComVal() {
		return (int)((Math.random()*3)+1);
	}
	
	// 승자를 보여주는 로직
	public String showWinner(int playerVal, int comVal) {
		int result = playerVal - comVal;
		String msg="";
		
		// switch(Math.abs(playerVal-comVal)){  //abs 절대값
		switch (result) {
		case -1:
		case 2: msg = "컴터가 이김"; break;
		
		case 1:
		case -2: msg = "너님이 이김"; break;
		
		case 0: msg = "비겨쒀"; break;
		}
		return msg;
	}
	
	// 숫자에 할당된 가위, 바위, 보 를 문자로 전환해서 보여주는 역할
	public String showRpsVal(int playerVal){
		String result = "";
		switch (playerVal) {
		case 1: result = "가위"; break;
		case 2: result = "바위"; break;
		case 3: result = "보"; break;
		default: result = "다시 입력하세요"; break;
		}
		return result;
	}


}
