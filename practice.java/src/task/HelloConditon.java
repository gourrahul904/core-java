package task;

public class HelloConditon {
	public static void main(String[] args) {
		int a=args.length;
		if(a==0) {
			System.out.println("java hello");
		}
		else{
			for(int i=0; i<a; i++) {
				System.out.println(i+ "  hello  "+args[i]);
			}
		}
	}

}
