package oop01.syntax;

/*
 * Date : 2015.05.19
 * Auther : 
 * Desc : static ���� 
*/
public class CardVO {

	private String kind; // ī���� ����
	private int number; // ī���� ����
	static int width = 100; // ī���� ��
	static int height = 250; // ī���� ����
	
	public CardVO() {}

	public CardVO(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String getKind(){
		return kind;
	}
	
	public int getNumber(){
		return number;
	}
	@Override
	public String toString(){
		return this.kind+" "+this.number;
	}
	
}
