package abstractFactory;

public class GiftOfCircles implements Gift {
	
	public void print(int n)
	{
		int m=n;
		while(m>0)
		{
			for(int i=0; i<n;i++)
				System.out.print("° ");
			System.out.println();
			m--;
		}
	}
}
