package pattern_Programs;

public class Fifteen_Pattern_Programs {
	
	public static void main(String[] args) {
		//RightAngledPattern();
		//ultaRightAngledPattern();
		//diamondPattern();
		//ultaDiamondPat();
		//CompleteDiamond();
		downmirrorStarPat();
	}
	
	public static void RightAngledPattern()
	{
		for(int i=0;i<=4; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void ultaRightAngledPattern()
	{
	
		int n=6;
		
		for(int i=0; i<=n; i++)
		{
			for(int j=2*(n-i); j>0; j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void diamondPattern()
	{
		
		int n=6;
		
		for(int i=0; i<=n; i++)
		{
			for(int j=(n-i); j>0; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void ultaDiamondPat()
	{
		int n=6;
		
		for(int i=0; i<=n; i++)
		{
			for(int j=(n+i);j>0; j--)
			{
				System.out.print("-");
			}
			for(int k=n; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
	}
	
	public static void CompleteDiamond()
	{
		int n=6;
		for(int i=0; i<=n; i++)
		{
			for(int j=(n-i); j>0; j--)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0; i<=n-1; i++)
		{
			for(int j=(1+i); j>0; j--)
			{
				System.out.print(" ");
			}
			for(int k=n-1; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void downmirrorStarPat()
	{
		int n=6;
	
		for(int i=0; i<=n; i++)
		{
			for(int j=2*(n+i); j>0; j--)
			{
				System.out.print(" ");
			}
			for(int k=n; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
	    }
	}
	   
	
	
	
	

}
