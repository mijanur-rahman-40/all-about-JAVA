
package methodsandclasses;

 class Animals {
  public static class Alpaca {
    public Alpaca() {
      System.out.println("Alpaca is born!");
     
    }
  }
  static void raju(){
        System.out.println("Iam raju");
    }
  public static class Llama {
    public Llama() {
      System.out.println("Llama is born!");
    }
  }
 
    public Animals() {
      System.out.println("Kingdom of animals is formed!");
    }
  }
class test{
    public static void main(String[] args) {
        Animals.Alpaca alpaca = new Animals.Alpaca(); // new Alpaca is created
        Animals.Llama llama = new Animals.Llama();
        System.out.println(Animals.class);
      
    }
}

