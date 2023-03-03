package date;

import java.text.SimpleDateFormat;
import java.util.Date;


public class date2 {
 public static void main(String[] args) {
	Date today=  new Date ();
	System.out.println(today);
    SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yy");
    String fd=sd.format(today);
    System.out.println(fd);
  
}

}
