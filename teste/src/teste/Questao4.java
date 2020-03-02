package teste;

public class Questao4 {

	public static void main(String[] args) {
		
		int[] wins = new int[] { 1,0,3 };
		int[] ties = new int[] { 2,2,0 };
		
		int pontos = championNumberOfPoints(wins, ties);
		
		System.out.println(pontos);
	}

	private static int championNumberOfPoints(int[] wins, int[] ties) {
		if (wins.length != ties.length)
			throw new IllegalArgumentException("wins and ties should have the same number of teams");
		
		int[] points = new int[wins.length];
		int championNumberOfPoints = 0;
		
		for (int i = 0; i < wins.length; i++) {
			points[i] = (wins[i] * 3) + (ties[i]);
			
			if (points[i] > championNumberOfPoints) 
				championNumberOfPoints = points[i];
			
		}
		
		return championNumberOfPoints;
	}
}
