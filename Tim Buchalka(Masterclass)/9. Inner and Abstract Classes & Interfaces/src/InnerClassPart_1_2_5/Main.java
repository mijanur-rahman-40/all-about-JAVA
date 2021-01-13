package InnerClassPart_1_2_5;

import InnerClassPart_1_1_5.GearBox;

public class Main {
    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));
        //GearBox.Gear second = new GearBox.Gear(1, 12.3); //Wrong

    }
}
