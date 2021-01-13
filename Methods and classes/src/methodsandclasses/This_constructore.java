
package methodsandclasses;
 class This{
     int one,two,three;
  This(int x,int y,int z){
      this( x,y);
      three=x+y+z;
      System.out.println("Three parameter");
      System.out.println("Value of Z is "+ z);
    }
    
  This(int x,int y){
      this(x);
      two=x+y;
      System.out.println("double parameter");
      System.out.println("Value of y is "+ y);
}
  This(int x){
      one=x;
      System.out.println("one parameter");
      System.out.println("Value of x is "+ x);
  }  
}
public class This_constructore {
    public static void main(String[] args) {
        This obj=new This(2,3,4);
        System.out.println("One   :" +obj.one);
        System.out.println("Two   :"+ obj.two);
        System.out.println("Three :"+ obj.three);
        
    }
}
