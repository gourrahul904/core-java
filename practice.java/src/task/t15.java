package task;

public class t15 {
	public static void main(String[]args) {
		int number= 153;
		int d=number;
		int re=0;
		int sum=0;
		while(d>0) {
			re= d % 10;
			sum=sum+(re*re*re);
			d=d /10;
		
		}if(sum==number) {
			System.out.println("arm");
		}else {
			System.out.println("not arm");
		}
		
		
	}

}
