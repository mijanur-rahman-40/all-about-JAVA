package Composition_Part2__3;

public class Lamp {
    private String style;
    private boolean battery;
    private int gloabRating;

    public Lamp(String style, boolean battery, int gloabRating) {
        this.style = style;
        this.battery = battery;
        this.gloabRating = gloabRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> turning on");
    }
    
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGloabRating() {
        return gloabRating;
    }
    
}
