package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date1 {
	public static void main(String[] args) {
		Date ab=new Date();
		System.out.println(ab);
	   SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	   String s=sdf.format(ab);
	   System.out.println(s);
	   
	  
	}

}
