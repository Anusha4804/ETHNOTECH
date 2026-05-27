public class balance {
    private int balance;
    public void setbalance(int balance) 
    {
        this.balance=balance;
    }
    public int getBalance()
    {
        return balance;
    }
    public static void main(String args[])
    {
        balance b=new balance();
        b.setbalance(2000);
        System.out.println(b.getBalance());
    }
}
 
