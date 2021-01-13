
package SimpleInterface;
//A nested interfsce example
class AB{
    //this  is a nested interface 
    public interface Nestdif{
        boolean isNotNegative(int x);
            
    }
}
//BC implements the nestested interface
class BC implements AB.Nestdif{
    @Override
    public boolean isNotNegative(int x){
       // return x >= 0;
       return x<0 ? false: true;
    } 
}
class TestDemo{
    public static void main(String[] args) {
        //use a nested interface referance
        AB.Nestdif ob = new BC();
        /*
        if(ob.isNotNegative(10))
            System.out.println("It is a positive number");
*/
        if(ob.isNotNegative(-12))
            System.out.println("It is a negative number");
    }
}
   





