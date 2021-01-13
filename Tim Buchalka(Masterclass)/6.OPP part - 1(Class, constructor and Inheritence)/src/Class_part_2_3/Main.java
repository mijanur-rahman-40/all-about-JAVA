package Class_part_2_3;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        //System.out.println("Model is : " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is : " + porsche.getModel());
        
        //After adding Validation
        porsche.setModel("Carrera");
        System.out.println("Model is : " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is : " + porsche.getModel());
    }
}
