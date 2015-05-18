package oop01.syntax;

public class AverageE {
	public static void main(String[] args) {
		
		String name = "ÇæÅ©";
		int kor = 100;
		int eng = 80;
		AverageEVO vo = new AverageEVO(name, kor, eng);
		
		System.out.println("=== "+name+"ÀÇ ¼ºÀûÇ¥ ===");
		System.out.println("±¹¾î : "+kor+"Á¡");
		System.out.println("¿µ¾î : "+eng+"Á¡");
		System.out.println("ÃÑÁ¡ : "+vo.tot()+"Á¡");
		System.out.println("Æò±Õ : "+vo.avg()+"Á¡");
		System.out.println();
	}
}
