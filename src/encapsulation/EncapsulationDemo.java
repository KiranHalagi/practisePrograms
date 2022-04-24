package encapsulation;


class hdfc
{
	String Bankname;
	private int acoountNo;
	
	public void setaccountNo(int accountNo)
	{
		this.acoountNo=accountNo;
	}
	
	public int getaccountNo()
	{
		return this.acoountNo;
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
      hdfc hd=new hdfc();
      hd.Bankname="HDFC BANK";
      System.out.println(hd.Bankname);
    		  
      hd.setaccountNo(11100);
      System.out.println(hd.getaccountNo());

	}

}
