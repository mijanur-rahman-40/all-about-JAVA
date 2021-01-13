
package pacakage_and_interfaces;
class balance{
    String name;
    double bal;
    balance(String n,double d){
        name = n;
        bal = d;
    }
    void show(){
        if(bal > 0){
            System.out.println("--->");
            System.out.println(name +" ball " +bal);
        }
    }
}
class acountbalance{
    public static void main(String[] args) {
        balance arr[] = new balance [3];
        arr[0]  = new balance("Raju",10.1);
        arr[1] = new balance("Ritu",-10.2);
        arr[2] = new balance("Dulal",5.5);
        for(int i=0; i<3; i++){
            arr[i].show();
        }
        
    }
}