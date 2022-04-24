package abstaction;

abstract class EnggCollege
{
	 abstract void displayCollegeName(String Name);
	 abstract void displaycityname(String cityname);
	 void displaybranches(String branches[])
	 {
		 for(int i=0;i<branches.length;i++)
		 {
			 System.out.println(branches[i]);
		 }
	 }
	 
}

class SLNEngg extends EnggCollege
{

	
	void displayCollegeName(String Name) {
		System.out.println("College  Name is : "+Name);	
	}


	void displaycityname(String cityname) {
		System.out.println("City Name is : "+cityname);	
	}
	
	void showAddress(String Address)
	{
		System.out.println("Address is : "+Address);
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		SLNEngg sln=new SLNEngg();
		sln.displayCollegeName("SLN ENGineering College");
		String branch[]= {"EC","ME"};
		sln.displaybranches(branch);
		sln.displaycityname("Raichuru");
		sln.showAddress("Vijaynagar Bangalore");
		

	}

}
