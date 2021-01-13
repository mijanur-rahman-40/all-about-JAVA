
package AccessProtection;

  class OuterClass1 {
      private int var  = 5;
     //Outer class can not be privste or protected
     //but ineer class can be all
    //non static nested class is called inner class
      class NestedClass1{
         private int innnerVar = var +5;
     }
      //static nested class 
     static  class NestedClass2{
         //private int innnerVar = var +5;
     }
    
}
