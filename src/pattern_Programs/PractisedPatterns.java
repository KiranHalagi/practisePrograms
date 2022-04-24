package pattern_Programs;

public class PractisedPatterns {

	public static void main(String[] args) {
		
		//RightAngledPattern();
		//ultaRightAngle();
		MixingRightAngled();
	}
	
	public static void RightAngledPattern()
	{
		for(int i=0; i<=4; i++)
		{
			for(int j=0;j<=i; j++)
			{
				System.out.print
				("* ");
			}
			System.out.println();
		}
	}
	
	public static void ultaRightAngle()
	{
		for(int i=0; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void MixingRightAngled()
	{
		int n=4;
		for(int i=0; i<=n; i++)
		{
			for(int j=0;j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
