package comm02.op;

public class No04_conditionDemo {
	public static void main(String[] args) {
		int val01 = 1;
		int val02 = 2;
		
		// if(()){} ���ǹ������� ������ �ۼ��� �� ������ �ۼ��ϴµ� �������̴µ��� ȿ�����̴�.
		if((val01 == 1) && (val02 == 2)){
			System.out.println("1������ 2������ �����ϴ�.");
		}
		if((val01 != 1) || (val02 != 2)){
			System.out.println("1������ 2������ �ٸ��ϴ�.");
		}
	}
}
