package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		// int kor; ���� Declaration
		// kor=90; �Ҵ� Allocation
		int kor=90, eng=85, sum=0;
		sum = kor + eng ;
		
		System.out.print("****** ����ó�� ******\n");
		System.out.println("����\t����\t�հ�");
		System.out.println("kor\teng\tsum");
		System.out.println("kor\t"+"eng\t"+"sum");
		System.out.println(kor+"\t"+eng+"\t="+sum);
		
		
	}
}
