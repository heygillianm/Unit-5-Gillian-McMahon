public class BankAccount implements Lockable{
    //attributes of a bank account (instance variables)
    private double balance;
    private double interest;
    private String accountName;
    private String owners;
    private String bankName;
    private int key;
    private boolean isLocked;

    //constructor for BankAccount class.Initializes instance variables
    public BankAccount (String accOwners, String accBank, String accName,
                        double accBalance, double accInterest){
        balance = accBalance;
        accountName = accName;
        owners = accOwners;
        bankName = accBank;
        interest = accInterest;
        isLocked = true;
    }

    public void setKey(int key){
        this.key = key;
    }

    public void lock(int theLock){
        theLock = 1;
    }

    public void unlock(int unlocked){
        unlocked = 0;
        isLocked = false;
    }

    public boolean locked(){
        if (key == 1){
            boolean locked = true;
        }
        boolean locked = false;
        isLocked = false;
        return locked;
    }
    //getter methods for instance variables
    public String getAccName(){
        return accountName;
    }
    public String getOwners(){
        return owners;
    }
    public String getBank(){
        return bankName;
    }
    public double getInterest(){
        return interest;
    }
    public double getBalance(){
        return balance;
    }

    //setter methods for instance variables
    public void setBalance(double theBalance){
        balance = theBalance;
    }

    public void setInterest(){
        setBalance(balance*(1+interest));
    }
    //methods for what a bank account does
    //lets client transfer money to another bank account
    public void transfer(double amount, BankAccount other){
        if (isLocked){
            System.out.println("Unable to access account until unlocked.");
        }
        else {
            other.setBalance(other.getBalance() + amount);
            this.setBalance(getBalance() - amount);
        }
    }

    //lets client withdrawl money
    public void withdrawl(double subWithdrawl) {
        if (isLocked) {
            System.out.println("Unable to access account until unlocked.");
        } else {
            setBalance(getBalance() - subWithdrawl);

        }
    }

    // lets client deposit money
    public void Deposit(double addDeposit) {
        if (isLocked) {
            System.out.println("Unable to access account until unlocked.");
        } else {
            setBalance(getBalance() + addDeposit);
        }
    }

    //prints current state of bank account
    public String toString(){
        String result = "";
        result += "    Account Owners: " + owners + ", Bank Name: " + bankName + "\n";
        result += "    Account Name: " + accountName + "\n";
        //result += "    Transfers: " + transfer +
        result += "    Account Balance: " + balance + "\n";
        return result;
    }
}