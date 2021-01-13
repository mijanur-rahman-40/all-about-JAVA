package SirCode;

public class SimpleException {

    static void show() {
        try {
            int a = 10;
            int b = 0;
            System.out.println("## 1");
            //int d = args.length;
            int c = a / b;
            System.out.println("C " + c);
            System.out.println("## 2");

            try {
                int arr[] = new int[10];
                arr[9] = 10;
                arr[10] = 11;
                System.out.println("## 3");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inside catch 2#" + e);
            }

            //throw new IllegalAccessException("Test");
        }catch (ArithmeticException e) {
            System.out.println("Inside catch 1# " + e);
} 
         catch (Exception e) {
            System.out.println("caught in Exception" + e);
        }
        /*
         catch(ArithmeticException e){
            System.out.println("Inside catch 1# "+e);
        }
         
 
        }
        catch(RuntimeException e){
            System.out.println("caught in runtime exceptino "+e);
        }
        catch(Exception e){
            System.out.println("caught in Exception"+e);
        }
         */
 /*
         catch(ArithmeticException e){
            System.out.println("Inside catch 1# "+e);
        }
         */
 /*
        catch(ArithmeticException e){
            System.out.println("Inside catch 1# "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Inside catch 2#"+e);
        }
        System.out.println("After catch");
         */
    }

    public static void main(String[] args) {
        show();
        /*
        int a = 10; int b= 0;
        System.out.println("## 1");
        int d = args.length;
       // int c = a/b;
         System.out.println("## 2");
        //System.out.println("C "+c);
        int arr[] = new int[10];
        arr[9] = 10;
        arr[10] = 11;
         System.out.println("## 3");
         */
    }
}
