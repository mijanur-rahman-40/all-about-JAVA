package FloatAndDouble_4;

public class FloatAndDouble {
    public static void main(String[] args) {
        
        //Width of int is 32 bits (4 bytes)
        int myIntValue = 5/3;
        //Width of float is 32 bits (4 bytes)
        float myFloatValue = 5f/3f;
        //float myFloatValue = 5.5;
//If we write myFloatValue = 5.5 then it will give an error as floating point values are by default treated as double in java and double value
//can not be fit in float
        //Width of double is 64 bits(8 bytes)
        double myDoubleValue = 5d/3d;
        double myDoubleValue2 = 5/3;//treat as integer
        System.out.println("myIntValue : "+myIntValue);
        System.out.println("myFloatValue : "+myFloatValue);
        System.out.println("myDoubleValue : "+myDoubleValue);
        System.out.println("myDoubleValue2 : "+myDoubleValue2);
    }
}
