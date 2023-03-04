package task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Thirty30days {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 2);
		 Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String fd=sdf.format(d);
		System.out.println(fd);
	}

}
