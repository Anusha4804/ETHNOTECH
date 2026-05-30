//overriding
package Polymorphism;
public class Vehicle {
	public static void main(String args[])
	{
		Cab o1=new Cab();
		Bike o2=new Bike();
		Auto o3=new Auto();
		Travel o4=new Travel();
		o4.charges();
		o1.charges();
		o2.charges();
		o3.charges();
	}

}
class Travel
{
	 void charges() {
		 System.out.println("Transportation.....");
	 }
	
}
class Cab extends Travel
{
	public void charges()
	{
		System.out.println("Cab costs 150$ for 2 km");
	}
	
}
class Bike extends Travel
{
	public void charges()
	{
		System.out.println("Bike costs 80$ for 2 km");
	}
	
}
class Auto extends Travel
{
	public void charges()
	{
		System.out.println("Auto costs 100$ for 2 km");
	}
	
}
