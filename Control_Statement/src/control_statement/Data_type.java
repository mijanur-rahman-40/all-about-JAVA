
package first_project;
/*
public class Data_type {
   public static void main(String[] args){
     boolean b=true;//dynamic initialization
     char c;
     short s=32677;
     int i=76875;
     float f=10.3f;
     double d=10.2;
     byte b1;
     //b=true;
     System.out.println("b = "+b);
     c='a';
     System.out.println("c = "+c);
     System.out.println("a = "+s);
     System.out.println("i = "+i);
     System.out.println("f = "+f);
     System.out.println("d = "+d);
   }
}
*/



//with printf function
public class Data_type{
    public static void main(String[] args){
        boolean b=true;//dynamic initialization
     char c='R';
     short s=32677;
     int i=76875;
     float f=10.3f;
     double d=10.2;
     byte b1;
     
     System.out.printf("bolean b= %b\n",b);
     System.out.printf("int i= %d\n",i);
     System.out.printf("short s= %s\n",s);
     System.out.printf("float f= %.2f\n",f);
     System.out.printf("double d= %.3f\n",d);
     System.out.printf("char c= %c\n",c);
    }
}