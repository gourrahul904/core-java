package task;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class stringtodate {
	public static void main(String[] args) throws ParseException {
	String d="03/03/2023";
	System.out.println(d);
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
  Date b= sdf.parse(d);
  System.out.println(b);
	
		
	}

}
