package task;

public class prime {
	public static void main(String[] args) {
		int num=10;
		int count=0;
		for(int i=2; i<num; i++) {
			if( num %i ==0) {
				count++;
			}
			
			}
		   if(count==0) {
			System.out.println("prime not");
			
		}
		   else {
			   System.out.println("prime");
		   }
		}
	}