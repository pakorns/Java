/*
*Display date and time
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateandTime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter fdt =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String fdatetime = dt.format(fdt);
		System.out.println("Local Date Time: "+ d);
		System.out.println("Date and Time : " + dt);
		System.out.println("After format Date and Time : " + fdatetime);

	}

}
