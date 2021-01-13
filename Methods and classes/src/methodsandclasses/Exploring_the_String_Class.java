
package methodsandclasses;
// Demonstrating Strings.
class StringPrint{
public static void main(String args[]) {
    String Ob1 = "First String";
     String Ob2 = "Second String";
   String Ob3 = Ob1 + " and " + Ob2;
     System.out.println(Ob1);
     System.out.println(Ob2);
     System.out.println(Ob3);
   }
}




// Demonstrating some String methods.
class StringEqual {
public static void main(String args[]) {
   String strOb1 = "First String";
   String strOb2 = "First String";
   String strOb3 = strOb1;
       System.out.println("Length of strOb1: " +
            strOb1.length());
       System.out.println("Char at index 3 in strOb1: " +
              strOb1.charAt(0));
             if(strOb1.equals(strOb2))
       System.out.println("strOb1 == strOb2");
     else
           System.out.println("strOb1 != strOb2");
             if(strOb1.equals(strOb3))
         System.out.println("strOb1 == strOb3");
        else
          System.out.println("strOb1 != strOb3");
   }
}

//Demonstrtate String array
class Raju{
    public static void main(String[] args) {
        String str[]={"one","two","three"};
        for(int i=0; i<str.length; i++){
            System.out.println("str[" + i +"] : " +str[i]);
        }
    }
}



