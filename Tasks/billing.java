import java.util.*;
public class billing{
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of units consumed:");
    int units=sc.nextInt();
    double bill;
    if(units<=250)
    {
        bill=units*0;
        System.out.print("bill:-"+bill);
    }
    else{
        int extraunits=units-250;
        bill=(extraunits/50)*50;
        System.out.print("bill"+bill);
        }
    }
}
