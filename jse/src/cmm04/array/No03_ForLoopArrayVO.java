package cmm04.array;

public class No03_ForLoopArrayVO {
	 
	 private int a, b, c, d, e;
	 
	 public int getA() {
	  return a;
	 }
	 public void setA(int a) {
	  this.a = a;
	 }
	 public int getB() {
	  return b;
	 }
	 public void setB(int b) {
	  this.b = b;
	 }
	 public int getC() {
	  return c;
	 }
	 public void setC(int c) {
	  this.c = c;
	 }
	 public int getD() {
	  return d;
	 }
	 public void setD(int d) {
	  this.d = d;
	 }
	 public int getE() {
	  return e;
	 }
	 public void setE(int e) {
	  this.e = e;
	 }
	 
	 void output(int a, int b, int c, int d, int e) {
		 setA(a);
		 setB(b);
		 setC(c);
		 setD(d);
		 setE(e);
		 int [] arr = {getA(),getB(),getC(),getD(),getE()};
		 int sum = 0;
		 for (int i = 0; i < arr.length; i++) {
			 sum += arr[i]; 
		 }
		 System.out.println("1���� 5������ ���� : " + sum);
	 }
	}


/*
private int[] arr = new int[5];
private int sum = 0;

public void setArr(int a, int b, int c, int d, int e){
	arr[0] = a;
	arr[1] = b;
	arr[2] = c;
	arr[3] = d;
	arr[4] = e;
		
	
	int result = 0;
	// 1 ���� 5������ ���� ���ϱ�
	
	for(int aa : arr){
		result += aa;
	}
	System.out.print(result);
	
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	
	
	// �Է¹��� �ټ����� ������ ���� ���ϱ�	
}

public int getSum(){
	return sum;
}

public void aa(){
	
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	System.out.println("1 ���� 5������ �� : " + getSum());
}

*/