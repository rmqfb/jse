package oop05.polymorphism;

public interface WebService extends WebDao{  // 인터페이스 끼리 상속 가능 but 권유하지 않는 방법이다.
	public String getAge();
	public String setAge();
	public String updateAge();
	public String deletAge();

}
