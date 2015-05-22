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
		
		// switch(Math.abs(playerVal-comVal)){  //abs ���밪
		switch (result) {
		case -1:
		case 2: msg = "���Ͱ� �̱�"; break;
		
		case 1:
		case -2: msg = "�ʴ��� �̱�"; break;
		
		case 0: msg = "��ܾ�"; break;
		}
		return msg;
	}

	@Override
	public String showRpsVal(int playerVal) {

		String result = "";
		switch (playerVal) {
		case 1: result = "����"; break;
		case 2: result = "����"; break;
		case 3: result = "��"; break;
		default: result = "�ٽ� �Է��ϼ���"; break;
		}
		return result;
	}

}
