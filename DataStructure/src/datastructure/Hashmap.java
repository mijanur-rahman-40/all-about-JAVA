package datastructure;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {
        System.out.println("Print HashMap");
        Map<String, String> mapOne = new HashMap();

        mapOne.put("Bhutan", "Thimpo");
        mapOne.put("Bangladesh", "Dhaka");
        System.out.println(mapOne);
        mapOne.put("India", "New Dilhi");
        System.out.println(mapOne);

        String name = mapOne.get("Bangladesh");
        System.out.println(name);

        mapOne.remove("Bhutan");
        System.out.println(mapOne);
    }

}
