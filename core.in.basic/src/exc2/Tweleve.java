package exc2;

public class Tweleve {
	public static void main(String[] args) {
		int number=121;
		int n=number;
		int r;
		int sum=0;
		
		
		while(n>0) {
			r=n% 10;
			sum= sum*10+r;
			n= n/10;
			System.out.println(sum);
		}
		if(number==sum){
		  System.out.println("is polindrom");
		}else {
			System.out.println("not polindrom");
		}
	}

}
