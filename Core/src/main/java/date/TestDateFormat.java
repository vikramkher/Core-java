package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestDateFormat {
	
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Default Formate date =" + d);
		
		String s = sdf.format(d);
		
		System.out.println("Formate Date=" + s);

		System.out.println("--------------------------------");

		String dob = "2008-08-18";
		System.out.println("String dob=" + dob);
		Date date = sdf.parse(dob);
		System.out.println("date dob=" + date);

	}

}
