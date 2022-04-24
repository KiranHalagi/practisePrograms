package casting;

class one
{
    void show1()
    {
    	System.out.println("Super class method");
    }
    
}

class Two extends one
{
	void show1()
	{
		System.out.println("Sub class method");
	}
}

public class UpCastingDemo {

	public static void main(String[] args) {
		//upasting we doing
		one a=new Two();
		a.show1();
		 
		
		

	}

}
