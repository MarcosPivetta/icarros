package teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Questao3 {

	public static void main(String[] args) {

		String[] momentos = { "11:00", "13:13", "10:00" };

		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		for (String momento : momentos) {

			if (true) {
				System.out.println("Apito Assustador");
				System.out.println(momento);
			}
			// AB:AB, AA:BB, AB:BA ou AA:AA.

		}

	}

}
