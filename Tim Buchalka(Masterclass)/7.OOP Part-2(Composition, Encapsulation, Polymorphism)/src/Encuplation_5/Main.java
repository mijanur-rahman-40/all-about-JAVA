package Encuplation_5;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true/*false*/);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed = " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed = " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
    }
}
