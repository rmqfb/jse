package oop05.polymorphism;

public interface WebService extends WebDao{  // �������̽� ���� ��� ���� but �������� �ʴ� ����̴�.
	public String getAge();
	public String setAge();
	public String updateAge();
	public String deletAge();

}
