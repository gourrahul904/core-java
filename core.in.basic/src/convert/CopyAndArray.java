package convert;

public class CopyAndArray {
	public static void main(String[] args) {
		char [] copyFrom= {'a','b','c','d','e','f','g','h','i','j'};
		char[] copyTo=new char[9];
		System.arraycopy(copyFrom, 2, copyTo, 5, 4);
		System.out.println(copyTo);
	}


	

}
