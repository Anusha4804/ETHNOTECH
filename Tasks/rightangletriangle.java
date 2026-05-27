import java.util.*;
public class rightangletriangle{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the triangle");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=i;s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}