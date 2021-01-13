package ByteSortInt_3;

public class Main {
    public static void main(String[] args) {
        
        //Int has a width of 32
        //Also can be write as 2_147_483_648 in java
        int mymaxvalue = 2147483647; 
        int myminvalue = -2147483648;
        int myinttotal = (myminvalue/2);
        System.out.println("MyIntTotal : "+myinttotal);
        
        //byte has a width of 8
        byte maxbyte = 127;
        byte minbyte = -128;
        byte myByteTotal = (byte)(maxbyte/2); 
//In java by defualt expresstion converted into int and integer can not fit into byte so here will be an error 
        System.out.println("MyByteTotal :" + myByteTotal);
        
        //short has a width of 16
        short maxshort = 32767;
        short minshort = -32768;
        short myShortTotal = (short) (maxshort/2); 
//In java by defualt expresstion converted into int and integer can not fit into byte so here will be an error 
        short myShortTotal1 = (byte) (maxshort/1000); 
//In java by defualt expresstion converted into int and but byte is smaller than short so byte will fit in short 
        System.out.println("Myshorttotal, Myshorttotal1 : " +myShortTotal + " , " +myShortTotal1);
        
        //long has a width of 64
        //In java must have to put l/L at the last of the long value but L(Capital) is preferable as l is quite similler to 1
        long maxlong = 9_223_372_036_854_775_807L; 
        long minlong = -9_223_372_036_854_775_808L; 
        long mylongTotal =  (maxlong/2);
        long mylongTotal1 = (long) (maxlong/2);
        System.out.println("mylongTotal : "+ mylongTotal);
        System.out.println("mylongTotal1 : "+ mylongTotal1);
        int x = (int) mylongTotal1;
        System.out.println("x :" +x);
//But for long mathematical expression return long data type ????????????????????????????????????????????????????????????????????
    }
}
