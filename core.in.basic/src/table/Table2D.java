package table;

public class Table2D {
	public static void main(String[] args) {
		
	
	int [] [] table= new int [11][11];
	for(int a=1; a<11; a++) {
		for (int b =1; b<=10; b++) {
			table[a][b]=a*b;
			
			System.out.print(a*b+"\t")  ;
		}
		System.out.println();
	}
	}


}
