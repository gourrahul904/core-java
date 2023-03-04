package task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date3 {
	public static void main(String[] args) {
		Date d= new Date();
		//System.out.println(d);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	  String fd=	sdf.format(d);
	 System.out.println(fd);
		
		
	     
		
	}
  
   
	

}
