package datastructure;

public class Array_list_two {
    public static void main(String[] args) {

        int[] myIntArray;
        myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);
        System.out.println(myIntArray.length);

        double[] myDoubleArray = new double[10];

        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println(num[5]);
        for (int i = 0; i < 5; i++) {
          num[i] = i*5;
        }
        for (int i=0; i<num.length; i++){
            System.out.println("Element "+i+",value is "+num[i]);
        }
    }
}
