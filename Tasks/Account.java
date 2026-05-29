class Account{
    protected double amount;

    void deposit(double value) {
        amount = amount + value;
    }

    void withdraw(double value) {
        amount = amount - value;
    }

    double getBalance() {
        return amount;
    }
}

class Display extends Account {
    void showAmount() {
        System.out.println("Available Amount: " + getBalance());
    }
}