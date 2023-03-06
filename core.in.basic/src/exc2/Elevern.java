package exc2;

public class Elevern {
public static void main(String[] args) {
	 int a=12;
	 int sum=0;
	 for(int b=2; b<a; b++) {
		  if(a % b==0) {
			  sum++;
		  }
	 
	 }if(sum==0) {
		 System.out.println("prime");
	 }
	 else {
		 System.out.println("not prime");
	 }
	 
}
}
