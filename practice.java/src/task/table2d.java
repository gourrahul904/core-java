package task;

public class table2d {
	public static void main(String[] args) {
	int [] [] table=new int [10][10];	
	int a,b;
	for(a=1; a<11; a++) {
		for(b=1; b<11; b++) {
			table[a][b]= a*b;
			System.out.println(a*b +"\t");
		}
		
	}
	}

}
