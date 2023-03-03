package task;

public class prime {
	public static void main(String[] args) {
		int a;
		int b=3;
		
		for(a=1; a<b; a++) {
			int c= b % a;
			if(b==0) {
				System.out.println("prime");
			} 
			else {
				System.out.println("not prime");
			}
			
		}
		
		
	}

}
