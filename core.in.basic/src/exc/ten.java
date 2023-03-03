package exc;

public class ten {

	public static void main(String[] args) {
		int number=370;
		int r;
		int sum=0;
		int n=number;
		while(n>0) {
		 r=n % 10;
		 sum= sum+(r*r*r);
		 n=n/10;
		}	
		if(number==sum){
		System.out.println("arm");
	}
		else {
			System.out.println("not arm");
		}
	
	
		
		}
	
}

	
	
	

