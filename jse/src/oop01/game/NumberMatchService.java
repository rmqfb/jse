package oop01.game;


public class NumberMatchService {
	
	NumberMatchVO vo = new NumberMatchVO();
	
	public void formun(int aa) {
		
		//for(int i=0; i<3; i++){
			System.out.print("1���� 5���� ������ �Է��ϼ���");

			int result = 0;
			
			try{
				int input = aa;
				vo.setPlayer(input);
			}catch(Exception e){
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}
			
			if(vo.getPlayer() == 0) {
				System.out.print("�ٽ� �Է��� �ֽʽÿ�");
			}else{
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
			}
			
			/*if(result == 1){
				System.out.println("������ϴ�. ������ �����մϴ�.\n");
				break;
			}else if(i==2){
				System.out.println("3ȸ ��� �����߽��ϴ�.\n ���ӿ��� �й��߽��ϴ�. \n������ �����մϴ�.");
				break;
			}*/
		//}
		
	}
	
	public int game(int com, int player){
		
		int result;
		
		if(vo.getPlayer() == vo.getCom()){
			System.out.println(vo.getPlayer() + "����!!");
			result = 1;
		}else{
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� " + vo.getCom() + " �Դϴ�.\n");
			result = 0;
		}
		return result;
	}
	
}
