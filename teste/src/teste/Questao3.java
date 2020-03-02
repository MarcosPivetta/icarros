package teste;

public class Questao3 {

	public int apitoAssustador(String[] moments) {
		
		for (String moment : moments) {
			String hora = moment.replace(":", "");
			
			if (hora.matches("(\\d)(\\d)\\1\\2") || hora.matches("(\\d)\\1(\\d)\\2") || hora.matches("(\\d)(\\d)\\2\\1")) {
				return 2;
			}
		}
		return 0;
	}
}
