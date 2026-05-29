public class Bank {
    protected int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Balance: " + balance);
    }
}

class Main extends Bank {
    int ac_no;

    public Main(int ac_no, int balance) {
        super(balance);     
        this.ac_no = ac_no;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Number: " + ac_no);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("After deposit balance is: " + balance);
    }

    void withdraw(int amount) {
        balance -= amount;
        System.out.println("After withdrawal balance is: " + balance);
    }

    public static void main(String[] args) {
        Main b = new Main(1234, 10000);

        b.displayInfo();
        b.deposit(10000);
        b.withdraw(1000);
    }
}