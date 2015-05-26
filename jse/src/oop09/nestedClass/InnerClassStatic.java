package oop09.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public static class Inner{ // ����ƽ Ŭ������ �ƿ��� Ŭ������ �ٸ� ��������� �����Ƿ�, ���� ��°Ŷ��....
		static int d = 1000;
		public void printData(){
			// System.out.println("�⺯ a : " + a);  // ���� : a�� static���� ����
			// System.out.println("�����̺� b : " + b); // ���� :  Ŭ������ static�̶�(static�� ���� ���� ��������� �÷������� ������ �ٸ� �������� �ҷ��ü��� ����) static �� �ƴ� ������ ������ ����.
			// static�� ���� �����ϼ� ������ local�� �ƿ���Ŭ������ ���� �����δ�. - ��������� ���� �����ΰ�...?  ������ ������ �ƴϴ�.
			/*
			 * 
			 * 
			 * a �� b ���� ������ ���� ����...
			 * static ����Ŭ������ ��� �� �̻��� ����Ŭ������ �ƴϴ�.
			 * ���� �ܺ�Ŭ������ ��ġ�� �ʰ� ������ �� �ִ�.
			 * ���� top level class ��� �Ͽ� �ֻ��� Ŭ������ �Ѵ�.
			 * ��¿�� ���� ����Ŭ������ static ���� �����ؾ� �ϴ� ��찡 �ִ�.
			 * �װ� �ٷ� ���� Ŭ������ ����� �� �ϳ���
			 * static ����� ���� ����̴�.
			*/
			System.out.println("����ƽ c : " + c);
			System.out.println("����ƽ d : " + d);
		}
	}
}
