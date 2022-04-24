package stringPractice;

public class StringAllMethods {

	public static void main(String[] args) {
		concatDemo();
		lengthDemo();
		charAtDemo();
		comperToDemo();
		EqualIgnoreCase();
		equals();
		equalsIgnoreCase();
		startsWith();
		endsWith();
		IndexOf();
		lastindexDemo();
		replaeDemo();
		subStringDemo();
		toLowerCaseDemo();
		toUpperCaseDemo();
		trimDemo();
		splitDemo();
		

	}

	public static void concatDemo()
	{
		String s1="Hydera";
		String s2="bad";
		String s3=s1.concat(s2);
		System.out.println("Concatenation of string is : "+s3);
		
		//another method for concatenation it is also called string concatenation operator
		String s4=s1+s2;
		System.out.println("Concatenation using '+' operator : "+s4);
	}
	
	public static void lengthDemo()
	{
		String s1="Hyderabad";
		System.out.println("Length of characters : "+s1.length());
	}
	
	public static void charAtDemo()
	{
		String s1="Hyderabad";
		System.out.println("Character of the position is : "+s1.charAt(3));
	}
	
	public static void comperToDemo()
	{
		String s1="abcd";
		String s2="Acdd";
		System.out.println("CompareTo :"+s1.compareTo(s2));
	}
	
	public static void EqualIgnoreCase()
	{
		String s1="box";
		String s2="Box";
		System.out.println("EqualIgnoreCase Method : "+s1.equalsIgnoreCase(s2));
	}
	
	public static void equals()
	{
		String s1="Karnataka";
		String s2="Karnataka";
		System.out.println("Output of equals method : "+s1.equals(s2));
	}
	
	public static void equalsIgnoreCase()
	{
		String s1="Karnataka";
		String s2="karnataka";
		System.out.println("output of equalsIgnoreCase Method : "+s1.equalsIgnoreCase(s2));
	}
	
	public static void startsWith()
	{
		String s1="Karnataka";
		String s2="K";
		System.out.println("StartsWith method output : "+s1.startsWith(s2));
	}
	
	public static void endsWith()
	{
		String s1="Karnataka";
		String s2="a";
		System.out.println("Endswith method output : "+s1.endsWith(s2));
	}
		
	public static void IndexOf()
	{
		String s1="This is a book";
		System.out.println(s1.indexOf("i"));
		System.out.println(s1.indexOf("book"));
	}
	
	public static void lastindexDemo()
	{
		String s1="Kiran";
		System.out.println("Last Index Example : "+s1.lastIndexOf("r"));
	}
	
	public static void replaeDemo()
	{
		String s1="Hello";
		String s2="site is BeginnersBook.com";
		System.out.println("Replace method Demo : "+s1.replace('l', 'x'));
		System.out.println("Replace method Demo : "+s1.replace("e", "r"));
		System.out.println("Replace method Demo : "+s1.replace("ello", "fgrt"));
		System.out.println("Replace method Demo : "+s1.replaceAll(s1, "exo"));
		System.out.println("String after replacing Site name :"+s2.replaceFirst("Beginners(.*)", "xyz.com"));
	}
	
	public static void subStringDemo()
	{
		String s1="KiranHalagi";
		System.out.println("Substring example : "+s1.substring(5));
		System.out.println("Substring example : "+s1.substring(1, 5));
		System.out.println("Substring example : "+s1.subSequence(1, 3));
	}
	
	public static void toLowerCaseDemo()
	{
		String s1="KIRAN";
		System.out.println("ToLowerCaseDemo : "+s1.toLowerCase());
	}
	
	public static void toUpperCaseDemo()
	{
		String s1="kiran";
		System.out.println("ToUpperCase Demo : "+s1.toUpperCase());
	}
	
	public static void trimDemo()
	{
		String s1=" Ravi Kiran";
		System.out.println("Trim Demo :"+s1.trim());
		System.out.println("***************************");
	}
	
     
	
	public static void splitDemo() 
	{
		System.out.println("Split example : ");
	     String s1="I love my india";
	     String s2[]=s1.split(" ");
	     for(int i=0;i<s2.length;i++)
	     {
	    	 
	    	 System.out.println(s2[i]);
	     }
	    
	}
}
