package control.statement;

public class sum2 {
	public static void main(String[]args) {
		int i;
		int sum=0;
		for(i=1; i<=10;i++) {
			System.out.print(i+"\t");
			sum=sum+i;
		}
		System.out.println(sum);  
	}

}
