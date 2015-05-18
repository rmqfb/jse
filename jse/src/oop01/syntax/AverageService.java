package oop01.syntax;

public class AverageService {
// vo에 있던 avg(), tot()메소드를 서비스에서 처리하도록 해주세요
	AverageDVO vo = new AverageDVO();
	
	public int tot(){
		return vo.getKor()+vo.getEng();
	}
	
	public double avg(){
		return tot()/2d;
	}
	
	public void aa(String name, int kor, int eng){
		vo.setName(name);
		vo.setKor(kor);
		vo.setEng(eng);
	}
}
