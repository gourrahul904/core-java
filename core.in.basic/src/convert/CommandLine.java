package convert;


public class CommandLine {
public static void main(String[] args) throws  Exception{
	int ch =System.in.read();
	System.out.println("Selected char ASCII Code"+ ch);
	if (ch =='A' ||ch =='a') {
		Add.main(args);
	}else if (ch =='D' || ch=='d') {
		Division.main(args);
	}else {
		System.out.println("Incorrect choice");
	}
	
	
}

	}


