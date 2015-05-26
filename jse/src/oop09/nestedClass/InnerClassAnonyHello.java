package oop09.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);
	}
	public void sayHello(){
		/*
		 * ����Ŭ���� �������̽� ������� 1
		*/
		class EnglishGreetingServiceImpl implements GreetingService{

			@Override
			public void greet(String name) {
				System.out.println("Hello" + name);
				
			}
		}
		GreetingService eng = new EnglishGreetingServiceImpl();
		/*
		 * ����Ŭ���� �������̽� ������� 2
		*/
		GreetingService kor = new GreetingService() {
			
			@Override
			public void greet(String name) {
				System.out.println("�ȳ��ϼ���." + name);
				
			}
		};
		GreetingService jap = new GreetingService() {
			
			@Override
			public void greet(String name) {
				System.out.println("���ġ��." + name);
				
			}
		};
		
		eng.greet("Tom");
		kor.greet("��");
		jap.greet("����");
	}
	public static void main(String[] args) {
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();
	}
}
