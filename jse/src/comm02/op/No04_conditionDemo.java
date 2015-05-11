package comm02.op;

public class No04_conditionDemo {
	public static void main(String[] args) {
		int val01 = 1;
		int val02 = 2;
		
		// if(()){} 조건문에서는 구조를 작성한 후 내용을 작성하는데 에러줄이는데에 효율적이다.
		if((val01 == 1) && (val02 == 2)){
			System.out.println("1번값과 2번값은 같습니다.");
		}
		if((val01 != 1) || (val02 != 2)){
			System.out.println("1번값과 2번값은 다름니다.");
		}
	}
}
