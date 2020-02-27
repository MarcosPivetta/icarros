package teste;

public class Questao4 {

	public static void main(String[] args) {
		int vencer = 3;
		int empatar = 1;
		int perder = 0;
		
		int[] campea = {1, 0, 3};
		int[] segunda = {2, 2, 0};
		
		int pontuacao = 0;
		for (int i : segunda) {
			
			switch (i) {
			case 3:
				pontuacao = pontuacao + 3;
				break;
			case 1:
				pontuacao = pontuacao + 1;
				break;
			case 0:
				pontuacao = pontuacao + 0;
				break;
			}
			
		}
		
		System.out.println(pontuacao);
	}

}
