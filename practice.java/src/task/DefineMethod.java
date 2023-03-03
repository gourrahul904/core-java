package task;

public class DefineMethod {
	public static void main(String[] args) {
		print(args);
	}

	private static void print(String[] args) {
		for(int a=0; a<args.length; a++) {
			System.out.println(args[a]);
		}
		
	}

}
