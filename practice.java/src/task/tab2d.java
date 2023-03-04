package task;

public class tab2d {
	public static void main(String[] args) {
		int [][]table=new int [15] [15];
		int a,b;
		for(a=1; a<=10; a++) {
			for(b=11; b<=14; b++) {
				table[a][b]=a*b;
				System.out.print(table[a][b]+"\t");
		
			}	
			
			System.out.println();
		}
		
	}
	}

