package exc2;

public class Fifteen {
	public static void main(String[] args) {
		int[] c= {3,14,15,9,110};
		int max=c[0];
		for(int i=0; i<c.length; i++) {
			if(max<c[i]) {
				max=c[i];
			}
			   
			System.out.println(max);
		   
			
		}
	//	System.out.println(max);
	}

}
