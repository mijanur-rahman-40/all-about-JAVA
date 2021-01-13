package SimpleInterface;

interface F {
    //public final static
            int X = 10;
            // Constructor does not Exist
            /*
            public A() {
                
            }
*/      
    public abstract void  print ();
   default public void print2(){
        // it does not work without default
    }
}
class Y implements F{
  @Override
  public  void  print(){
      System.out.println("Implemented by class F");  
    }
    
}
/*
abstract class X{
    public X(){
        
    }
    public void print2(){ //we can give defination in abstract class for method
        
    }
    public abstract void print();
}
*/
public class Simple2 {
    public static void main(String[] args) {
        System.out.println(F.X);
        // it does not exist
        /* F obj = new F(); */
        Y obj = new Y();
        obj.print();
    }
}