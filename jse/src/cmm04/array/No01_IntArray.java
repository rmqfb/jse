package cmm04.array;

public class No01_IntArray {
	public static void main(String[] args) {
		int[] intArr;
		intArr = new int[10];
		
		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		intArr[3] = 400;
		intArr[4] = 500;
		intArr[5] = 600;
		intArr[6] = 700;
		intArr[7] = 800;
		intArr[8] = 900;
		intArr[9] = 1000;
		intArr[10] = 1100;
		intArr[11] = 1200;
		
		// 에러 : 배열의 방을 10개 만들었는데, 11개의 값을 집어 넣어서 18Line에서 오류발생 / 오류난 배열에서는 앞의 값도 불러오지 않음. ex> intArr[0]  >> 오류
		
		System.out.println("Element at index 11 : " + intArr[11]);
		
	
	}
}
