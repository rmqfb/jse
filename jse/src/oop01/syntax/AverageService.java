package oop01.syntax;

public class AverageService {
// vo�� �ִ� avg(), tot()�޼ҵ带 ���񽺿��� ó���ϵ��� ���ּ���
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
