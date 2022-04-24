package pattern_Programs;

public class Number_Pattern {

	public static void main(String[] args) {
		
		//NumPatTwo();
		//diamondShape();
          DoubleDiamond();
	}

	public static void NumberPattern()
	{
		for(int i=1; i<=4;i++)
		{
			for(int j=1;j<i+1; j++)
		    {
				System.out.print(j+" ");
		     }
			System.out.println();
		}
		
	}
	
	
	public static void NumPatTwo() {
		
		int n=5;
		for(int row=0; row<=n; row++ )
		{
			for(int col=0;col<=row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//System.out.println();
		
		for(int row=n-1; row>=0; row--)
		{
			for(int col=0; col<=row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}
	
	
	public static void diamondShape()
	{

		for(int i=0; i<3; i++)
		{
			
 			for(int k=3; k>=i; k--)
 			{
 				System.out.print(" ");
 			}
 			
 			
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void DoubleDiamond()
	{
		int n=4;
		for(int i=0; i<n ; i++)
		{
//			for(int j=n;j>=i; j--)
//			{
//				System.out.print(" ");
//			}
			
			for(int k=0; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	
		
	}
	
}