package oop02.encapsule;

public class RpsService {

	// ��ǻ�Ͱ� �������� �߻���Ų �� 1~3����
	public int displayComVal() {
		return (int)((Math.random()*3)+1);
	}
	
	// ���ڸ� �����ִ� ����
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
	
	// ���ڿ� �Ҵ�� ����, ����, �� �� ���ڷ� ��ȯ�ؼ� �����ִ� ����
	public String showRpsVal(int playerVal){
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
