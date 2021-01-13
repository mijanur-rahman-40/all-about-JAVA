
package methodsandclasses;
public class Main_class {
    public static void main(String[] args) {
        Box5 ob1=new Box5(5,2,3);
        //Box6 b1=new Box6(5,5,5);
       Box5 b4=new Box5(ob1);
        b4.changevalue(ob1.height,ob1.width,ob1.depth);
        System.out.println(b4.getVolume());
        //System.out.println(b4.getVolume());
         //Box6 b2=new Box6(10,10,10);
         //Box6 b3=new Box6(5,5,5);
         
        //System.out.println(b1.isEqual(b2));
         //System.out.println(b2.isEqual(b3));
          //System.out.println(b3.isEqual(b1));
    }
}
