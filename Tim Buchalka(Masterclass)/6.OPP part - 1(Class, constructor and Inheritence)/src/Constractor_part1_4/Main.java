package Constractor_part1_4;

public class Main {
    public static void main(String[] args) {
        BankAccout bobsAccount = new BankAccout();
       //BankAccout bobsAccount = new BankAccout("12345", 0.0, "Bob Brown", "myemail@bob.com", "(007) 123-4567");
        /*
        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCoustomerNumer("Bob Brown");
        bobsAccount.setCoustomerEmailAddress("myemail@bob.com");
        bobsAccount.setCoustomerPhoneNumber("(007) 123-4567");
        */
        
        bobsAccount.withdraw(100.0);
        
        bobsAccount.deposit(50.01);
        bobsAccount.withdraw(100.0);
        
        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);
    }
}
