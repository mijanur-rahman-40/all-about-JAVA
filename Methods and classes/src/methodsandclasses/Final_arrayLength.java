
package methodsandclasses;
class Final{
final int number;
final int MAX_LENGTH=10;
//MAX_LENGTH=100;
Final(){
    number =10;
}
}
public class Final_arrayLength {
    public static void main(String[] args) {
        Final obj=new Final();
        //obj.number=20;
        int a1[]=new int[10];
        int a2[]={1,2,3,4};
        System.out.println("a1 ar  length :"+a2.length);
        System.out.println(+obj.number);
        
    }
}
