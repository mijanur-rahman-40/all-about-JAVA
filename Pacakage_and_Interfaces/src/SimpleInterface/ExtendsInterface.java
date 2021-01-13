
package SimpleInterface;
interface M{
    int S = 19;
    default void print1(){
        System.out.println("tititiitti");
    }
}
interface N extends M{
    int S = 10;
    void print2();
}

interface O extends N{
     int S = 20;
    void print3();
}
class impl implements O{
    @Override
    public void print3(){
        
    }
    @Override
    public void print2(){
        
    }
   @Override
   public void print1(){
        
    }
   public void Func(){
       System.out.println(S);
   }
}
public class ExtendsInterface{
    public static void main(String[] args) {
        impl ob = new impl();
        ob.Func();
    }
}


interface a{
    void meth1();
    void meth2();
} 
interface b extends a{
    void meth3();
}
class est implements b{
    @Override
    public void meth1(){
        System.out.println("meth1");
    }
    @Override
     public void meth2(){
        System.out.println("meth2");
    }
     @Override
      public void meth3(){
        System.out.println("meth3");
    }
}
class test2 {
    public static void main(String[] args) {
        est ob = new est();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}

