public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner){
        this.owner = owner;
        balance = 0;
    }

    public BankAccount(String owner, int balance){
        if (balance <= 0)
            System.out.println("Balance should be greater than 0!");
        else{
            this.balance = balance;
            this.owner = owner;
        }
    }

    public void deposit(int amount){
        if(amount > 0)
            balance += amount;
        else
            System.out.println("Amount deposited should be greater than 0!");
    }

    public void withdraw(int amount){
        if (amount > balance && amount > 0)
            System.out.println("Amount should be greater than 0 and less than balance!");
        else
            balance -= amount;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

}
