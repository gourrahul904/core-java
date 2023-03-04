package task;

public class prime2 {
public static void main(String[] args) {
	int a=13;
	int b=0;

	for( int c=2; c<a; a++) {
		if( a%c==0) {
			b++;
		}
		if(b==0) {
			System.out.println("not prime");
		}
		else {
			System.out.println(" prime");
		}
		
	}
	
	
}
}
