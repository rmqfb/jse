package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {
	double height;
	double weight;
	int idx;
	//Scanner scanner = new Scanner(System.in);
	
	public No07_Kaup() { //카우프 인덱스 / 기본생성자
		this(0,0);
	}

	public No07_Kaup(double height, double weight) {  // 기본생성자에 있는 this 에 에러가 뜨면 마우스 갖다대면 생성자 를 만들수 있게 메뉴가 뜸
		this.height = height;  // 지역파라미트 변수의 값을 멤버변수에 넣는다.
		this.weight = weight;
		this.idx = (int)((weight/(height*height))*10000);
	}
	
	// getter,setter 자동완성 방법 alt+shift+s > generate getters and setters.. > 원하는 애들 체크 > 확인
	/*public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = scanner.nextDouble();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = scanner.nextDouble();
	}*/
	String getMsg(){
		String msg = "";
		if(idx>30){msg = "비만";}
		else if(idx>24){msg = "과체중";}
		else if(idx>20){msg = "정상";}
		else if(idx>15){msg = "저체중";}
		else if(idx>13){msg = "마름";}
		else if(idx>10){msg = "영양실조";}
		else{msg = "소모증";}
		return msg;
	}

	@Override
	public String toString() {
		return "카우프지수 [키=" + height + "cm, 몸무게=" + weight + "kg, 카우프지수="
				+ getMsg() + "]";
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		
		No07_Kaup nk = new No07_Kaup(height,weight);
		System.out.println(nk.toString());
		
		System.out.println("완료");
	}
	
}
