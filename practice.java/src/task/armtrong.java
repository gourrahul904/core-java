package task;

public class armtrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13,remainder,armstrong=0;
		int temp=num;
				while(num>0)
				{
					remainder=num%10;
					armstrong=armstrong+(remainder*remainder*remainder);
					num=num/10;
				}
				if(armstrong==temp)
				{
					System.out.println("armstrong");
				}
				else
				{
					System.out.println("not");
				}
					

	}

}
