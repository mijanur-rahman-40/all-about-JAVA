
package SimpleInterface;

 interface A{
   int X = 10;
   int B = 13;
   double D = 2.3;
   void add();
   void mod();
   void del();
}
class D implements A{
    @Override
    public  void add(){
        System.out.println("It is add function :");
    }
   
    @Override
    public void mod(){
       System.out.println("it is mod function");
   }
    @Override
    public void del(){
       System.out.println("it is del function");
   }

  }
interface B{
    public final static  int F = 12;
    void disp();
}
interface C extends B,A{
    void query();
}

abstract class X{
    /*
    public X(){
        
    }
    public void print2(){
        
    }
    public abstract void print();
*/
}




class Z extends X implements C{
    
    
    @Override
    public  void add(){
        System.out.println("It is second add function :");
    }
        @Override
    public void mod(){
       System.out.println("it is second mod function");
    }
    @Override
    public void del(){
       System.out.println("it is second del function");
    }

    @Override
    public void query(){
         System.out.println("it is  query function"); 
      }
    @Override
    public void disp(){
         System.out.println("it is  disp function");
     }
     
   
    
  }
class test{
    public static void main(String[] args) {
       D ob  = new D();
       System.out.println("D constructor ar sob man and method gula :");
       System.out.println("X ar man holo :" +A.X + "  and  " + A.D);
       ob.add(); ob.del();ob.mod();
       Z ob1 = new Z();
       System.out.println("Z constructor ar man sob gula");
       ob1.add();
       ob1.del();
       ob1.disp();
       ob1.mod();
       ob1.query();
        
                
       
    }
}