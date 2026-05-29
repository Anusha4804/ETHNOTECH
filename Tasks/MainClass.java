class MainClass {
    public static void main(String[] args) {

        Display d = new Display();

        d.deposit(50000);
        d.showAmount();

        d.withdraw(10000);
        d.showAmount();

        System.out.println("Final Balance: " + d.getBalance());
    }
}