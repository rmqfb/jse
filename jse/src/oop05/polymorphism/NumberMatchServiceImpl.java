package oop05.polymorphism;

public class NumberMatchServiceImpl implements NumberMatchService{
	
	boolean result;
	
	@Override
	public int makeComVal() {
		int com = (int)((Math.random()*2));  // 0~1 값 출력
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
		 
		aa = result == true ? "플레이어 승리" : "컴퓨터 승리";
		return aa;
	}



}
