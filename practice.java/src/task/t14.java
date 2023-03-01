package task;

public class t14 {
	public static void main(String[]args) {
		int number=153;
		int r=0;
		int sum=0;
		int n=number;
		
		while(n>0) {
			r=n % 10;
			sum=sum+(r*r*r);
			n= n/10;
		}
		
	}

}
