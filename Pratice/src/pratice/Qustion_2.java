
package pratice;

interface Exam {
    static int n = 10;
   void register();
    
        
   default
        void collectTophics(){
        //n = 100;
    }
    static void completeSyllabus(){
        
    }
}
interface Syllabus extends Exam{
    
}
class termtest implements Exam{
    public void register(){
        System.out.println("Study!!");
    }
    public static void main(String[] args) {
        termtest ob = new termtest();
       // Syllabus obj = new Syllabus();
        //Exam.collectTophics();
        //ob.completeSyllabus();
    }
}


class ExceptionalClss{
    private static void sout(String prntStr){
        System.out.println(prntStr);
    }
    public static void main(String[] args) {
        try{
            try{
                throw new NullPointerException();
            }catch(Exception e){
                sout(e.toString());
                throw new RuntimeException();
            }
        }
        catch(Exception e){
            sout(e.toString());
          throw new ArithmeticException();
        }
        finally{
            sout("Finish");
        }
    }
}