package oop01.syntax;

public class AverageC {
	public static void main(String[] args) {
		
		AverageVO vo = new AverageVO();
		
		vo.setName("ÇæÅ©");
		vo.setKor(99);
		vo.setEng(60);
		
		System.out.println("=== "+vo.getName()+"ÀÇ ¼ºÀûÇ¥ ===");
		System.out.println("±¹¾î : "+vo.getKor()+"Á¡");
		System.out.println("¿µ¾î : "+vo.getEng()+"Á¡");
		System.out.println("ÃÑÁ¡ : "+vo.tot()+"Á¡");
		System.out.println("Æò±Õ : "+vo.avg()+"Á¡");
		System.out.println();
	}
}
