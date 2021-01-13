
package SimpleInterface;
interface Callback{
    void callback(int param);
}
//public interface SImple {
    class Client implements  Callback{
    public void callback(int p){
        System.out.println("call back call with :"+p);
    }
}
//}
class Testcase{
    public static void main(String[] args) {
        Callback ob = new Client();
        ob.callback(42);
    }
}
