package oop03.inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		// �Ϲ����� ��ü����
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		
		// �θ� Ÿ�� = new �ڽ�Ÿ��   // �θ��� �޼ҵ常 ��� ����
		Aclass a2 = new Bclass();  // a2 �� Bclass �� �ٶ󺸰� �ְ�, Aclass �� ��Ӱ��迩�� �ϰ�, BŬ������ AŬ������ �����ϰ� �ִ�  a2�� BŬ������ ���� ã�� A�� �״����� ã�´�.
		// �������̵��� �ڽ�Ŭ���� �޼ҵ� �켱 ���
		a2.over(1);
		// �������̵� ���� ������ �θ�Ŭ���� �켱 ȣ��
		a2.noOver(1);
		// �θ�Ŭ���� Ÿ���� �ڽ�Ŭ������ ���� ����ȯ
		Bclass b2 = (Bclass)a2;
		b2.over(1);
		b2.noOver("AAA");
	}
}

class Aclass{
	void over(int i){
		System.out.println("Aclass-over() : " + (i*10));
	}
	void noOver(int i){
		System.out.println("Aclass-noOver() : " + i);
	}
}

class Bclass extends Aclass{
	public Bclass() {
		super.noOver(2);
	}
	void over(int i){
		System.out.println("Bclass-over() : " + (i*10000));
	}
	void noOver(String s){
		System.out.println("Bclass-noOver() : " + s);
	}
	void onlyB(){
		System.out.println("onlyB()");
	}
}
