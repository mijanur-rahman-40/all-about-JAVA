package Composition_2;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimension);

        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resulation(2540, 1440));

        Motherbaord theMotherbaord = new Motherbaord("BJ-200", "Asus", 4, 6, "V2.44");
        PC thePc = new PC(theCase, theMonitor, theMotherbaord);
        thePc.getMonitor().drawPixelAt(1500, 1200, "red");
        thePc.getMotherbaord().loadProgram("Windows 1.0");
        thePc.getTheCase().pressPowerButton();
    }
}
