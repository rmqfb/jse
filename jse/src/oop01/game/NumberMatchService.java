package oop01.game;


public class NumberMatchService {
	
	NumberMatchVO vo = new NumberMatchVO();
	
	public void formun(int aa) {
		
		//for(int i=0; i<3; i++){
			System.out.print("1부터 5까지 정수만 입력하세요");

			int result = 0;
			
			try{
				int input = aa;
				vo.setPlayer(input);
			}catch(Exception e){
				System.out.println("문자는 안됩니다.");
			}
			
			if(vo.getPlayer() == 0) {
				System.out.print("다시 입력해 주십시오");
			}else{
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
			}
			
			/*if(result == 1){
				System.out.println("맞췄습니다. 게임을 종료합니다.\n");
				break;
			}else if(i==2){
				System.out.println("3회 모두 참여했습니다.\n 게임에서 패배했습니다. \n게임을 종료합니다.");
				break;
			}*/
		//}
		
	}
	
	public int game(int com, int player){
		
		int result;
		
		if(vo.getPlayer() == vo.getCom()){
			System.out.println(vo.getPlayer() + "정답!!");
			result = 1;
		}else{
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 " + vo.getCom() + " 입니다.\n");
			result = 0;
		}
		return result;
	}
	
}
