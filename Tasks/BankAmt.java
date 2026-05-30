package Interface;
public class BankAmt {
	public static void main(String args[])
	{
		Detail_s obj=new Detail_s();
		obj.UPI();
		obj.Cash();
	}
}
interface Class1{
	void UPI();
}
interface Class2
{
	void Cash();
}
class Detail_s implements Class1,Class2{
	public void UPI()
	{
		System.out.println("UPI number Should be Added");
	}
	public void Cash()
	{
		System.out.println("Cash should be morethan 1000");
	}
}
