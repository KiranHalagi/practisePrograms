package pattern_Programs;

public class Square_Pattern {

	public static void main(String[] args) {
		
		for(int row=4; row>=0; row--)
		{
			for(int col=0; col<=row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		

	}

}
