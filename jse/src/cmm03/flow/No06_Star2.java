package cmm03.flow;

public class No06_Star2 {
	public static void main(String[] args) {
		
		/*
		 * �ڡڡڡڡ�
		         �ڡڡڡ�
		         �ڡڡ�
		         �ڡ�
		         ��
		 */
		
		
		for(int i = 0; i < 6; i++) {
			for(int j = 1; j < (6-i); j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		
		
	}
}
