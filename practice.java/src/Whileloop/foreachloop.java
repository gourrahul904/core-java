package Whileloop;

public class foreachloop {
	public static void main(String[]args) {
		int sum=0;
	int[]no= {4,5,3,6,4,3};
	System.out.println(" position "+no[3]);
	for(int j:no) {
		System.out.println("  "+j);
		sum=sum+j;
		
	}
	System.out.println("total "+sum);
	int c=no.length;
	System.out.println("length "+c);
	
	}
}
