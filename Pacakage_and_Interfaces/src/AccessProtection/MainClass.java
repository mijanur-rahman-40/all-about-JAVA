
package AccessProtection;
//superclass
  class MainClass1 {
      //t public but not private inprotected default diffrent package
    public void add(int a,int b){ 
      int ans = a + b;
        System.out.println("Sum of your given numbers is "+ans);
     }
   public void showk2(){
        System.out.println("This is you");
    }
}

// Subclass
 public  class MainClass extends MainClass1{
   public  int k;    //protected  public but not private and default
   public void showk(){
        System.out.println("K :"+k);
    }
    
}

//non-subclass

 class MainClass2{
    // public but not private,protected ,default
        public  void AMi(){
        System.out.println("What's going on");
    }
}



/*

package AccessProtection;

For same pacakage

//superclass
  class SuperClass {
      //protected default public but not private in same package
    void add(int a,int b){ 
      int ans = a + b;
        System.out.println("Sum of your given numbers is "+ans);
     }
    void showk2(){
        System.out.println("This is you");
    }
}
// Subclass
 class SubClass extends SuperClass{
     int k;    //protected default public but not private
    void showk(){
        System.out.println("K :"+k);
    }
    
}
//non-subclass
class ExtraClass{
    //protected default public but not private
         void AMi(){
        System.out.println("What's going on");
    }
}


*/




/*
class test{
    public static void main(String[] args) {
        SubClass ob = new SubClass();
        ob.k = 21;
        ob.add(3,4);
        ob.showk();
        ob.showk2();
      }
        
    }

*/