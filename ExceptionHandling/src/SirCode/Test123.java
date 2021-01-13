package SirCode;

public class Test123 {
private static class MyException extends Exception {
        public MyException(String demo) {
           // System.out.println(demo);
        }
    }
    public static void main(String[] args) {
        try {
            throw new MyException("Demo");
        } catch (Exception e) {
            System.out.println("caught : " + e.toString());
        }
    } 
}
