package task;

public class prime {
	public static void main(String[] args) {
		int num=17;
		int count=0;
		for(int i=2; i<num; i++) {
			if( num %i ==0) {
				count++;
			}
			
			}
		   if(count==0) {
			System.out.println("prime");
			
		}
		   else {
			   System.out.println("prime not");
		   }
		}
	}