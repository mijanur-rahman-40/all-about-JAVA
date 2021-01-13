
package inheritance;
class R{
    final void meth(){
        System.out.println("This is a final method  ");
    }
}
class S extends R{
    //void meth(){
        //System.out.println("Illegal ");
    }
//}
 class FinalWithInheritance {
     public static void main(String[] args) {
         S ob = new S();
     }
}
