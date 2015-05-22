package oop05.polymorphism;

public class RpsServiceImpl implements RpsService{

	@Override
	public int displayComVal() {
		return (int)((Math.random()*3)+1);

	}

	@Override
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

	@Override
	public String showRpsVal(int playerVal) {

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
