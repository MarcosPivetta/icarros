package teste;

public class Questao3 {

	public static void main(String[] args) {
		
		String[] moments = { "11:00", "13:13", "10:00" };
		
		int retorno = apitoAssustador(moments);
		
		System.out.println(retorno);
	}
	
	private static int apitoAssustador(String[] moments) {
		
		for (String moment : moments) {
			String hora = moment.replace(":", "");
			
			if (hora.matches("(\\d)(\\d)\\1\\2") || hora.matches("(\\d)\\1(\\d)\\2") || hora.matches("(\\d)(\\d)\\2\\1")) {
				return 2;
			}
		}
		return 0;
	}
}
