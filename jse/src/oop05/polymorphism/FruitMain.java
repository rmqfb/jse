package oop05.polymorphism;

public class FruitMain {
	public static void main(String[] args) {
		// �������̽��� ��ü�� ���� �� ����.
		// ��, FruitInterface fi = new FruitInterface();
		// ������ �߻��Ѵ�.
		FruitInterface apple = new AppleImpl();
		FruitInterface banana;
		// FruitInterface Ÿ���� ���������� ����.
		banana = new BananaImpl();
		// Ŭ���� BananaImpl �� ��ü�� �����Ͽ�
		// banana �� �Ҵ�.
		FruitInterface orange = new OrangeImpl();
		apple.display("���ִ� ");
		banana.display("������ ");
		orange.display("��� ");
		// orange.getCount();
		// �������̽����� ����� �޼ҵ常 ȣ���� �����ϴ�.
		
		OrangeImpl impl = new OrangeImpl();
		impl.getCount();
	}
}
