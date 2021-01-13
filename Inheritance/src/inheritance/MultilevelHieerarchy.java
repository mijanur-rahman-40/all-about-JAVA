
package inheritance;
class Area{
    private double width;
    private double height;
    private double depth;
    Area(Area ob){
        width  = ob.width;
        height = ob.height;
        depth  = ob.depth;
    }
    Area(double h,double w,double d){
        height = h;
        depth  = d;
        width  = w;
    }
    Area(){
        width  = -1;
        depth  = -1;
        height  = -1;
        
    }
    Area(double len){
        depth = width = height = len;
    }
    double volume(){
        return width*depth*height;
    }
}
class AreaWeight extends Area{
    double weight;
    AreaWeight(AreaWeight ob){
        super(ob);
        weight = ob.weight;
    }
    AreaWeight(double w,double h,double d,double m){
        super(h,w,d);
        weight  = m;
    }
    AreaWeight(){
        super();
        weight = -1;
    }
  
    AreaWeight(double len, double m) {
             super(len);
               weight = m;
    }
}
// Add shipping costs.
    class Shipment extends AreaWeight {
       double cost;
    Shipment(Shipment ob) { 
           super(ob);
          cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
           super(w, h, d, m); 
          cost = c;
    }

    Shipment() {
    super();
       cost = -1;
    }

    Shipment(double len, double m, double c) {
    super(len, m);
          cost = c;
    }
}
class MultilevelHieerarchy {
public static void main(String args[]) {
Shipment shipment1 =new Shipment(10, 20,15,10,3.41);
Shipment shipment2 =new Shipment(2, 3, 4, 0.76, 1.28);
    double vol;
    vol = shipment1.volume();
    System.out.println("Volume of shipment1 is " + vol);
    System.out.println("Weight of shipment1 is "+ shipment1.weight);
    System.out.println("Shipping cost: $" + shipment1.cost);
    System.out.println();
    vol = shipment2.volume();
    System.out.println("Volume of shipment2 is " + vol);
    System.out.println("Weight of shipment2 is "+ shipment2.weight);
    System.out.println("Shipping cost: $" + shipment2.cost);
   }
}

