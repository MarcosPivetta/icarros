package teste;

import java.util.Random;

public class Questao2 {

	public static void main(String[] args) {
		
		
		int scoreFinal = 0;
		
		for (int stage = 1; stage <= 10; stage++) {
			System.out.println("Stage: " + stage);
			
			int score = new Random().nextInt(4);
			
			switch (score) {
			case 0:
				System.out.println("Pontua��o: --- ");
				break;
			case 1:
				System.out.println("Pontua��o: *-- ");
				break;
			case 2:
				System.out.println("Pontua��o: **- ");
				break;
			case 3:
				System.out.println("Pontua��o: *** ");
				break;
			}
			
			scoreFinal = scoreFinal + score;
		}
		
		System.out.println("Pontua��o Final: " + scoreFinal);
	}
}
