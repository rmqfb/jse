package oop02.encapsule;
/*
 * Date : 2015.05.15
 * Author : Ŵ��!
 * Description : ����, ����, �� ���ӳ��� 
 * 1�� ����, 2�� ����, 3�� ��
 */ 
public class GameRpsService {
	/*
	 * ���� ���� ���� ����,����,�� ���� ����
	 */
	public String showRpsValue(int playervalue) {
		String result = "";
		switch (playervalue) {
		case 1:  result = "����"; break;
		case 2: result = "����"; break;
		case 3: result = "��"; break;
		default: result = "�ٽ� �Է��ϼ���"; break;
		}
		return result;
	}

	/*
	 * ��ǻ�Ͱ� �������� �߻���Ų �� 1~3����
	 */
	public int displayComValue() {
		int comValue = (int)(Math.random()*3)+1;
		return comValue;
	}
	
	/*
	 * ���ڸ� �����ִ� ����
	 */
	public String showWinner() {
		
		return null;
	}

	
}
