package task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EMI {
	public static void main(String[] args) throws ParseException {
		Calendar cal= Calendar.getInstance();
		String sour="21/12/2022";
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		cal.setTime(sdf.parse(sour));
		for(int i = 1; i<=12; i++) {
			cal.add(Calendar.DATE, 30);
			Date d = cal.getTime();
			String r = sdf.format(d);
			System.out.println(r);
		}
		
         		
	}

}
