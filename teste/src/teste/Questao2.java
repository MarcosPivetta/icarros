package teste;

public class Questao2 {
	
	public int pontuacaoFinal(String[] results) {

		int total = 0;

		for (String result : results) {
		
			if (result.equals("---")) {
				total = total + 0;
			}

			if (result.equals("*--")) {
				total = total + 1;
			}

			if (result.equals("**-")) {
				total = total + 2;
			}

			if (result.equals("***")) {
				total = total + 3;
			}
		}
		return total;
	}
}