package abstaction;

abstract class EnggCollege1
{
	abstract void CollegeName(String Collgename);
	abstract void cityname(String CityName);
	void displayBranches(String branches[])
	{
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}
	}
}

class SLNEngg1 extends EnggCollege1
{
	void CollegeName(String Collgename)
	{
		System.out.println("College Name is : "+Collgename);
	}
	
	void cityname(String CityName)
	{
		System.out.println("City Name is : "+CityName);
	}
	
	void showaddres(String address)
	{
		System.out.println("Address is : "+address);
	}
}
public class CantCreateObject {

	public static void main(String[] args) {
		EnggCollege1 sln=new SLNEngg1();
		sln.CollegeName("SLN Engg College");
        sln.cityname("Bangalore");
        String branch[]= {"ec","me"};
        sln.displayBranches(branch);
       // sln.showaddress
        
	}

}
