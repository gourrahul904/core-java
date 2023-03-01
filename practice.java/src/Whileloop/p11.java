package Whileloop;

public class p11 {
public static void main(String[]args) {
	//int a;
	//for(a=100;a>1;a--) {
		//System.out.println(a);
	//}
	int [] b= {3,5,7,5,3,2};
	//for(int i=0; i<b.length; i++) {
		//System.out.println(b[i]);
	//}
	//for(int i=b.length-1; i>=0;i--) {
		//System.out.println(b[i]);
	//}
	int sum=0;
	for(int t:b){
		System.out.print(t+"\t");
		System.out.println(sum=sum+t);
	}
	
}
}
