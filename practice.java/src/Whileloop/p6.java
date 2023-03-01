package Whileloop;

public class p6 {
	public static void main(String[]agrs) {
		int i=2;
		int sum=0;
		do {
			System.out.println(i);
			i=i+2;
			sum=sum+i;
			//System.out.println(sum);
		} 
		while(i<=20);
		System.out.println("sum  "+sum);
	}
	

}
