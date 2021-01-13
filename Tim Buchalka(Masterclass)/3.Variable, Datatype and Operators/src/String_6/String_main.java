package String_6;

public class String_main {
    public static void main(String[] args) {
        
        String myString = "This is a string";
        System.out.println("myString is = "+myString);
        myString += " and this is more.";
        System.out.println("myString is = "+myString);
        myString += " \u00A9 2018";
        System.out.println("myString is = "+myString);
        
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println("The result is = "+numberString);
        
        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println("Last string is equal to = "+lastString);
        double doublenumber = 120.58;
        lastString += doublenumber;
        System.out.println("Last string is equal to = "+lastString);
    }
    
}
