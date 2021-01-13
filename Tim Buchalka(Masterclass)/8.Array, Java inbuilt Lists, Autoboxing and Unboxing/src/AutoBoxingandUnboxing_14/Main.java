package AutoBoxingandUnboxing_14;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] intArray = new int[10];


        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>(); //Error because arraylist must be a class not primitive data type
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //Autoboxing
        Integer integerValue = new Integer(100);
        Double doubleValue = new Double(100.100);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        //Unboxing
        for(int i = 0; i <= 10; i++) {
            System.out.println((i + 1) + " -> " + intArrayList.get(i).intValue());
        }
        Integer myIntValue = 10; //Integer.valueof(10) actually java doing this for me
        int myValue = myIntValue; //myIntValue.intValue(); java doing this automatically

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            //myDoubleValue.add(Double.valueOf(dbl));
            myDoubleValue.add(dbl);
        }
        for(int i = 0; i < myDoubleValue.size(); i++) {
            double value = myDoubleValue.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
