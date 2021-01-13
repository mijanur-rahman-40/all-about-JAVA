package Class_part_2_3;

public class Car {
    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    
    ///setModel method without Validation
    /*
    public void setModel(String model) {
        this.model = model;
    }
    */
    ///setModel method with Validation
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }
        else 
            this.model = "Unknown";
    }
    
    public String getModel() {
        return this.model;
    }
    
}
