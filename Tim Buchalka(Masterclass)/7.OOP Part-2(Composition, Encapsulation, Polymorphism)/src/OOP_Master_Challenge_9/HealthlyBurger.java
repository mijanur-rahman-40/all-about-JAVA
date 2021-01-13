package OOP_Master_Challenge_9;

/**
 *
 * @author jahid
 */
public class HealthlyBurger extends Hambarger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthlyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
    
    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    
    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override 
    public double itemizHambarger() {
        double hambargerPrice = super.itemizHambarger(); 
        if(this.healthyExtra1Name != null) {
            hambargerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Price + " for an extra " + this.healthyExtra1Price);
        }
        
        if(this.healthyExtra2Name != null) {
            hambargerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Price + " for an extra " + this.healthyExtra2Price);
        }
        
        return hambargerPrice;
    }
    
    
}
