package comm03.flow;

public class No06_Star {
	public static void main(String[] args) {
		//��
		
		/*
		 ��
		�ڡ�
		�ڡڡ�
		�ڡڡڡ�
		�ڡڡڡڡ�
		*/
		
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("��");
			} // j
			System.out.println();
		} // i
	} 
}
