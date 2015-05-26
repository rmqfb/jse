package oop09.nestedClass;

/*
 * ����Ŭ������ ù��° ����
 * - �ν��Ͻ� ���� Ŭ����
 * - ����޼ҵ带 Ŭ���� ���ο� ������
*/
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
		// m.getInnerClassInstance();
		// m.getInnerClassLocal();  // ��ü new �Ѱ� �޸� �� �������� �ʱ� ����, �޼ҵ忡�� ��ü new �޸� �ϰ�, �ʿ��Ҷ� �޼ҵ带 ȣ���ؼ� ��ü?�� ����Ҽ� �ְ�... �޸𸮸� �������� �ʰԲ� �Ѵ�.
		// m.getInnerClassStatic_Inner();
		
		m.getInnerClassAnonyServiceImpl();
		
		
	}

	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
	}

	public void getInnerClassStatic_Inner() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner(); //Ŭ����.������ �� �ٷ� ���� / �ƿ��� Ŭ�����ȿ� �̳� ����ƽ Ŭ���� ���� ��� / ��� ��ü�� �ƴ϶��?
		inn.printData(); // �̳� ����ƽ �ȿ� �޼ҵ忡 ����
	}

	public void getInnerClassLocal() {  // static �� ����  / �������� : static �ϸ� �޸𸮸� ��ƸԱ� ������ ���ش�.
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
	
	// alt + shift + m  >> �޼ҵ� ���� ����Ű  >> �����丵

	public void getInnerClassInstance() { //static �� ����
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();  // �ƿ���Ŭ�����ǻ�����.�̳�Ŭ�����ǻ����� �� ���� / �ƿ���Ŭ����.�ȿ�Ŭ���� ��ü = new �ƿ���Ŭ����.new �ȿ�Ŭ����;
		inn.printData();
	}
}
