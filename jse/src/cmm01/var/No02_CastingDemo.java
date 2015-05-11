package cmm01.var;
/*
 * Upcasting
 * = 변환(Conversion)
 * = promotion
 * = 묵시적(implict) 자동변환
 * : 자바가 제공하는 자동변환으로 묵시적인 동작
 * 데이터 타입의 표현범위가 작은쪽에서 많은쪽으로 변환 될때만 가능하다.
*/
public class No02_CastingDemo {
	public static void main(String[] args) {
		byte varByte = 1;
		int varInt = 123;
		double vardou = 123.456d;
		
		int upByte = (int)varByte;  // (int) 는 생략이 가능하며 생략 가능한 문법은 생략해 주는게 좋다.
		double upInt = varInt;
		
		System.out.println(upByte);
		System.out.println(upInt);
		
		/*
		 * Down-Casting
		 * = 캐스팅(Casting)
		 * 강제형변환
		 * : 프로그램에서 명시적으로 지정하는 타입변환.
		 * 축소변환이 되는 경우는 반드시 명시적으로 캐스팅하여야 함.
		 * 주의!!! 데이터 손실이 발생할 수 있다.
		 */
		
		float varFlo = 123.456f;
		int downFlo = (int) varFlo;
		System.out.println("다운캐스팅 결과값 : " + downFlo);
	}
}
