package abstaction;
abstract class Wholesaler
{
     abstract void text_books(String tenthStd);
     abstract void pencils();
}

class Retailer1 extends Wholesaler
{
	void text_books(String tenthStd) {
		
		System.out.println("Tenth books are "+tenthStd);
	}
	
	 void pencils()
	{
		System.out.println("Pencil is 5 rupees");
	}
	
	void pens(String pens)
	{
		System.out.println("Pens are : "+pens);
	}
}
class Retailer2 extends Wholesaler
{
	void text_books(String tenthStd) {
	
		System.out.println("Tenth books are "+tenthStd);
	}
	
	void pencils()
	{
		System.out.println("pencil is 6 rupees");
	}
	
	void papers(String paper)
	{
		System.out.println("Books are : "+paper);
	}
}

public class AbstractionVsInterface {

	public static void main(String[] args) {
	 
		Retailer1 rt1=new Retailer1();
		rt1.text_books("Kan, eng, Hindi");
		rt1.pens("reynolds");
		rt1.pencils();
		System.out.println("*******************************");
		
		Retailer2 rtl2=new Retailer2();
		rtl2.text_books("maths");
		rtl2.papers("jkbond");
		rtl2.pencils();

	}

}
