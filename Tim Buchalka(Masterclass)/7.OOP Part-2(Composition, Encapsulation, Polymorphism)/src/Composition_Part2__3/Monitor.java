package Composition_Part2__3;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resulation nativeResulation;

    public Monitor(String model, String manufacturer, int size, Resulation nativeResulation) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResulation = nativeResulation;
    }
    
    public void drawPixelAt(int x, int y, String colour) {
        System.out.println("Drawing pixel at " + x + "." + y + " in colour " + colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resulation getNativeResulation() {
        return nativeResulation;
    }
}
