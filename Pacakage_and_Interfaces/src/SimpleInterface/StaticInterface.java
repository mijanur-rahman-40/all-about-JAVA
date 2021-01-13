
package SimpleInterface;


 interface MyIF3{
// This is a "normal" interface method declaration.
// It does NOT define a default implementation.
  // int getNumber();
    // This is a default method. Notice that it provides
   // a default implementation.
default String getString() {
return "Default String";

}
// This is a static interface method.
static int getDefaultNumber() {
return 0;
    }
   class MyIFImp2 implements MyIF3 {

    public String getString() {
    return "This is a different string.";
   }
   }
 public static void main(String[] args) {
     MyIFImp2 ob = new MyIFImp2();
     ob.getClass();
     
     
     
     
 }
   }

