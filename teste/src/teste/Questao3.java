package teste;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Questao3 {

	public static void main(String[] args) {

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("hh:mm");
		String strDate = dateFormat.format(date);
		String hour = strDate.replace(":", "");

		if (hour.matches("(\\d)(\\d)\\1\\2") || hour.matches("(\\d)\\1(\\d)\\2") || hour.matches("(\\d)(\\d)\\2\\1")) {
			System.out.println("Apito Assustador");
			System.out.println(strDate);
		} else {
			System.out.println(strDate);
		}
	}
}
