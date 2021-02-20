package classstructureintegrate;

public class BankAccount {

    private String AccountNumber;
    private String Owner;
    private Integer Balance;

    public BankAccount(String accountNumber, String owner, Integer balance) {
        this.AccountNumber = accountNumber;
        this.Owner = owner;
        this.Balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public String getOwner() {
        return Owner;
    }

    public Integer getBalance() {
        return Balance;
    }

    public void deposit(Integer amount) {
        this.Balance = this.Balance + amount;
    }

    public void withdraw(Integer amount) {
        this.Balance = this.Balance - amount;
    }

    public void transfer(BankAccount to, Integer amount) {
        this.withdraw(amount);
        to.deposit(amount);
    }

    public String getInfo() {
        return this.getOwner() + " (" + this.getAccountNumber() + "): " + this.getBalance() + " Ft";
    }

}
