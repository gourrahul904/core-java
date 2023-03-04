package task;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TwelMonth {
public static void main(String[] args) {
 
	
	Calendar cal= Calendar.getInstance();
	cal.add(Calendar.DATE, 5);
	Date d= cal.getTime();
	System.out.println(d);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String df=sdf.format(d);
	System.out.println(df);
	
}
}
