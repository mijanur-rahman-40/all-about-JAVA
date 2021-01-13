
package threadAndOtherSirCode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Caller {
    synchronized static void call(String str){
        System.out.print("[" + str);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.print("]");
    }

   // [hello1[hello2[hello3]]]
}
