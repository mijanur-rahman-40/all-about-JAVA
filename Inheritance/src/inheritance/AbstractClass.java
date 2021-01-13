//A simple demonstration of abstract class
package inheritance;
 abstract class P{
    abstract  void callme();
    void callmetoo(){
        System.out.println("This is a concrete method");
    }
}

//class Q extends  P,Z{ abstract or any class can not inherite more than one class
class Q extends P{
    @Override
    void callme(){
        System.out.println("Q's is implement of of callme.");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Q ob = new Q();
        ob.callme();
        ob.callmetoo();
    }
}


//Using abstract method and classes
abstract class figure{
    double dim1;
    double dim2;
    abstract double area();
    figure(double a,double b){
        dim1 = a;
        dim2 = b;
    }
}
class rectangle extends figure{
    rectangle(double a,double b){
       super(a,b); 
    }

    @Override
    double area() {
        System.out.println("Inside area for rectangle.");
        return dim1*dim2;
    }
}
class triangle extends figure{
    triangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside area for triangle.");
        return dim1*dim2/2;
    }
}
class AbstractArea{
    public static void main(String[] args) {
        //figure ob = new figure (10,10) 
           
        rectangle r = new rectangle(9,5);
        triangle   t  =  new  triangle(10,8);
        figure fig;
        fig = r;
        System.out.println("Area is "+ fig.area());
        fig = t;
        System.out.println("Area is "+ fig.area());
    }
}



abstract class Product{
    int multiply = 5;
    abstract void multiply();
    abstract void AnotherMultiply();
    /*
    abstract void multiply(){
        
    }
*/ 
    Product(int M){
        multiply = M;
    }
}
abstract class TimesTwo extends Product{
    void multiply(){
        System.out.println("This is multiply method *2: "+ multiply*2);
    }
   TimesTwo(int N){
       super(N);
   }
}
    class AnotherTimesTwo extends TimesTwo{
    void AnotherMultiply(){
        System.out.println("This is also Too *3 : "+ multiply*3);
    }
    AnotherTimesTwo(int O){
        super(O);
    }
}
class Testclass{
    public static void main(String[] args) {
        //Product ob = new Product(); 
        //TimesTwo ob1  = new TimesTwo(66);
        AnotherTimesTwo ob = new AnotherTimesTwo(736);
        ob.AnotherMultiply();
       
                }
}

