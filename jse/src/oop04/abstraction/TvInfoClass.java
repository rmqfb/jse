package oop04.abstraction;

public class TvInfoClass extends ProductInfoClass{
	private String screenSize;
	private String screenType;
	
	public void setInfo(String company, String name, String sid, String screenSize, String screenType){
		// �����ϱ�
		super.setInfo(company, name, sid);
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	public void displayInfo(){
		// �����ϱ�
		super.displayInfo();
		System.out.println("��ġ ���� : " + this.screenSize);
		System.out.println("ȭ�� ���� : " + this.screenType);
	}
}
