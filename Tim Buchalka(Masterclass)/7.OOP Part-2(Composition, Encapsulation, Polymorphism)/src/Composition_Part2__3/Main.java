package Composition_Part2__3;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimension);

        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resulation(2540, 1440));

        Motherbaord theMotherbaord = new Motherbaord("BJ-200", "Asus", 4, 6, "V2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherbaord);
        thePC.powerUp();
        
        
        
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        
        Celling celling = new Celling(12, 55);
        
        Bed bed = new Bed("Mordern", 4, 3, 2, 1);
        
        Lamp lamp = new Lamp("Classic", false, 75);
        
        Bedroom bedroom = new Bedroom("Tim's bedroom", wall1, wall2, wall3, wall4, celling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        
        
    }
}
