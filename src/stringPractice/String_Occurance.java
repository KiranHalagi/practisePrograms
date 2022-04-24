package stringPractice;

public class String_Occurance {

	public static void main(String[] args) {
		
     StringOccurance("SG testing SG SG", "SG");
	}

	public static void StringOccurance(String strmain, String strSearch)
	{
		int count=0;
		int position=0;
		
		
		for(int i=0;i<strmain.length();i++)
		{
			position=strmain.indexOf(strSearch,position);
			
			if(position==-1)
			{
				break;
			}else
			{
				count++;
				position++;
			}
		}
		
		System.out.println(count);
	}

	
}
