package teste;

public class Questao2 {

	public static void main(String[] args) {

		String[] result = new String[] { "---", "*--", "**-", "***" };

		int total = pontuacaoFinal(result);

		System.out.println(total);
	}

	private static int pontuacaoFinal(String[] result) {

		int total = 0;
		for (String point : result) {

			if (point.equals("---")) {
				total = total + 0;
			}

			if (point.equals("*--")) {
				total = total + 1;
			}

			if (point.equals("**-")) {
				total = total + 2;
			}

			if (point.equals("***")) {
				total = total + 3;
			}
		}
		return total;
	}
}
