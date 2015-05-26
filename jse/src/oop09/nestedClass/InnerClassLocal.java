package oop09.nestedClass;

/*
 * ����Ŭ���� �� �ι�° ����
 * - Local ���� Ŭ���������� �ܺ� Ŭ������ ����� �����ϴµ� �־
 * - ������ ������. �켱 �ܺ� Ŭ������ ���������  ������ �� �ִ�.
 * - ������ �޼��� ������ ���������� ������ �� ����.
*/
public class InnerClassLocal {
	int a = 100;
	public void innerTest(int k){
		int b = 200;
		final int c = k;
		class Inner{  // ���� �̳� Ŭ������ �ƹ����� �޼ҵ� �̴�.
			public void getData(){
				System.out.println("������� a : " + a);
				System.out.println("��� c : " + c);
				// System.out.println("�������� b : " + b); // �������� b�� ����� ������ ����� �����ϴ�. >> �⺯��, ����� ��� ����
			}
		}
		Inner inn = new Inner();
		inn.getData();
	}
}
