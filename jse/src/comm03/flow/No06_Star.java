package comm03.flow;

public class No06_Star {
	public static void main(String[] args) {
		//¡Ú
		
		/*
		 ¡Ú
		¡Ú¡Ú
		¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú
		¡Ú¡Ú¡Ú¡Ú¡Ú
		*/
		
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("¡Ú");
			} // j
			System.out.println();
		} // i
	} 
}
