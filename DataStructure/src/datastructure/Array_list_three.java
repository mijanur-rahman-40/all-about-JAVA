package datastructure;

import java.util.ArrayList;
import java.util.List;

     class car {
        private List<String> getData() {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("car");
            return list;
        }
        public static void main(String[] args) {
            car obj = new car();
            System.out.println(obj.getData());
        }
    }

