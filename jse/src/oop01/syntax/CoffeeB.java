package oop01.syntax;

/*
 * �����ڴ� �ν��Ͻ��� ������ ��
 * ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼ҵ�' �̴�.
*/
class MilkCoffee{
	public MilkCoffee(){
		System.out.println("���� �ִ�");
	}
	public MilkCoffee(int money){
		this();
		System.out.println(money + "��");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		// this.setMoney(money);  ������ ���� �ʴ�... this. �޼ҵ� ���ִ°� ���� �ʴ°� ����..
		System.out.println("�������ɿ��� : " + (exist == true ? "Ŀ����������" : "Ŀ�Ǿ���"));
	}
	public void setMoney(int money){
		
	}
}
public class CoffeeB {
	// ���� �ִ�
	// 500��
	// ���Ű��ɿ��� : Ŀ����������
	// �����ڸ� �ѹ��� ����
	public static void main(String[] args) {
		new MilkCoffee(500, true);
		// �ν��Ͻ��� ������ �ʴ� �ּҰ��� ����
		// ����(���۷���) �����̴�.
	}
	
}
