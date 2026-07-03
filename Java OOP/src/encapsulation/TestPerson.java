package encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		person bro = new person();
		bro.setName("Ram");
		bro.setDob(sdf.parse("2005-02-02"));
		bro.setAddress("Indore");
		bro.setGender("male");
		
		System.out.println("p1 name :-" +bro.getName());
		System.out.println("p1 dob :-"+bro.getDob());
		System.out.println("p1 address:-"+bro.getAddress());
		System.out.println("p1 gender :-"+ bro.getGender());
	}
}
