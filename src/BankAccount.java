public class BankAccount {

    private String owner = "Adrian";
    private double balance = 0;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double value){
        if(value > 0){
            balance += value;
        }
    }

    public boolean withdraw(double value){
        if( value > 0 && balance > value) {
            balance -= value;
            return  true;
        }
        return false;
    }

    public double getBalance(){
        return balance;
    }

    public String toString(){
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {

        BankAccount bank = new BankAccount("Adrian", 0);
        System.out.println(bank.getBalance());
        bank.deposit(2500);
        bank.withdraw(1992);
        System.out.println(bank.toString());

    }
}