package exc2;

public class eight {
public static void main(String[] args) {
	int table[][] =new int [11][11];
	for(int a=1; a<=10; a++ ) {
		for(int b=2; b<=10; b++) {
			table[a][b]=a*b;
			System.out.print(table[a][b]+"\t");
			
		}
		System.out.println();
	}
}
}
