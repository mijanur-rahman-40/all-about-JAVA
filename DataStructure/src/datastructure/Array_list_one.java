package datastructure;

import java.util.ArrayList;

public class Array_list_one {

    public static void main(String[] args) {
        System.out.println("print array list : ");
        /*
        //Declarition of list
        List<String> list = new ArrayList<>();// INdex value always starts from zero
        
        list.add("Bangladesh");
        list.add("India");
        System.out.println(list);
        
        list.add("Srilanka");
        list.add("Bhutan");
        System.out.println(list);
        
        list.remove(0);
        System.out.println(list);
        
        String name = list.get(2);
        System.out.println("India is a beautyfull country : "+name);

        int position = list.indexOf("Butan");
        System.out.println("INdex position of Bhutan : "+position);
         */
 /*     
        Array limitations
        (i) Fixed in size -> overcomed by ArrayList 
        (ii) can hold same data types of elements -> object
        
                  | (i)  We can store any number of data.
        ArrayList-| (ii) We can store any types of data.
                  |_(iii)Is a data structure in java.
        
        int a[] = new int[5] -->nirmal array declaration
        ArrayList al = new ArrayList(); -->allows all the data type elements
        ArrayList<Integer> al = new ArrayList<Integer>(); -->allows only integer type elements             
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("Raju");
        list.add("Ritu");
        list.add("Tuha");

        System.out.println(list.size());

        for (String s : list) // reading elements from arraylist
        {
            System.out.println(s);
        }
        ArrayList<java.io.Serializable> al = new ArrayList<>();
        // adding elements to array list
        al.add("Welcome");
        al.add(3);
        al.add(10.2);
        al.add('C');
        System.out.println("Number of elements : "+al.size());
        System.out.println(al);
        
        //inserting elements into array list
        
        al.add(2,"Training");
        al.add(1, 1234);
        System.out.println("Number of elements : "+al.size());
        System.out.println(al);
    }
}
