
package inheritance;
class SuperClass {
     void add(int a,int b){
      int ans = a + b;
        System.out.println("Sum of your given numbers is "+ans);
     }
    void showk2(){
        System.out.println("This is you");
    }
}
class SubClass extends SuperClass{
    int k;
    void showk(){
        System.out.println("K :"+k);
    }
    
}
class test{
    public static void main(String[] args) {
        SubClass ob = new SubClass();
        ob.k = 21;
        ob.add(3,4);
        ob.showk();
        ob.showk2();
      }
        
    }
class v{
    int i = 4;
    void top(){
        System.out.println("it is a method");
    }
}
class M extends v{
    
}
class tst{
    public static void main(String[] args) {
        M ob = new M();
        System.out.println(ob.i);
        ob.top();
    }
}