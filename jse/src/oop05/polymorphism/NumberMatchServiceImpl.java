package oop05.polymorphism;

public class NumberMatchServiceImpl implements NumberMatchService{
	
	boolean result;
	
	@Override
	public int makeComVal() {
		int com = (int)((Math.random()*2));  // 0~1 �� ���
		return com;
	}

	@Override
	public boolean match(int playVal, int comVal) {
		result = playVal == comVal ? true : false;

		return result;
	}

	@Override
	public String display() {
		 String aa = "";
		 
		aa = result == true ? "�÷��̾� �¸�" : "��ǻ�� �¸�";
		return aa;
	}



}
