package Constractor_part1_4;

public class BankAccout {
    private String Number;
    private double Balance;
    private String CoustomerName;
    private String CoustomerEmailAddress;
    private String CoustomerPhoneNumber;
    
    
    //Constructor(Empty)
    /*
    public BankAccout() {
        System.out.println("Empty constructor called");
    }
    */
    public BankAccout() {
        this("12345", 0.0, "Bob Brown", "myemail@bob.com", "(007) 123-4567");
        System.out.println("Empty constructor called");
    }
    public BankAccout(String number, double balance, String customarname, String CoustomerEmailAddress, String CoustomerPhoneNumber) {
        System.out.println("Account constructor with parameter called");
        this.Number = number;
        this.Balance = balance;
        this.CoustomerName = customarname;
        this.CoustomerEmailAddress = CoustomerEmailAddress;
        this.CoustomerPhoneNumber = CoustomerPhoneNumber;
    }
    
    
    
    public void deposit(double deposit) {
        this.Balance += deposit;
        System.out.println("Deposit amount " + deposit + " made. New balance is " + this.Balance);
    }
    public void withdraw(double withdraw) {
        if(this.Balance - withdraw < 0) 
            System.out.println("Only " + this.Balance + " available. Withdrowl not processed");
        else {
            this.Balance -= withdraw;
            System.out.println("Withdrawal of "+ withdraw+ " processed .Remaining amount is " + this.Balance);
        }
    }
    
    public String getNumber() {
        return Number;
    } 
    public void setNumber(String Number) {
        this.Number = Number;
    } 
    
    
    public double getBalance() {
        return Balance;
    } 
    public void setBalance(double Balance) {
        this.Balance = Balance;
    } 
    
    
    public String getCoustomerName() {
        return CoustomerName;
    } 
    public void setCoustomerNumer(String CoustomerName) {
        this.CoustomerName = CoustomerName;
    } 
    
    
    public String getCoustomerEmailAddress() {
        return CoustomerEmailAddress;
    } 
    public void setCoustomerEmailAddress(String CoustomerEmailAddress) {
        this.CoustomerEmailAddress = CoustomerEmailAddress;
    } 
    
    
    public String getCoustomerPhoneNumber() {
        return CoustomerPhoneNumber;
    } 
    public void setCoustomerPhoneNumber(String CoustomerPhoneNumber) {
        this.CoustomerPhoneNumber = CoustomerPhoneNumber;
    } 
}
