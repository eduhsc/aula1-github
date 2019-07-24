package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class ProgCap6Date {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat();
		SimpleDateFormat sdf4 = new SimpleDateFormat("MMyyyy");
		
		Date x1 = new Date();
		Date x2 = sdf1.parse("07/03/1982");
		Date x3 = Date.from(Instant.parse("1982-03-07T15:42:07Z"));
		
		System.out.println(sdf1.format(x1));
		System.out.println(sdf2.format(x1));
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(sdf3.format(x3));
		System.out.println(sdf4.format(x3));
	}

}
