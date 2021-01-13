package LinkListPart_2_19;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();
        placeToVisit.add("Sydney");
        placeToVisit.add("Melbourne");
        placeToVisit.add("Brisbane");
        placeToVisit.add("Perth");
        placeToVisit.add("Canberra");
        placeToVisit.add("Adelaide");
        placeToVisit.add("Darwin");

        printList(placeToVisit);
        placeToVisit.add(1, "Alice Springs");
        printList(placeToVisit);
        placeToVisit.remove(4);
        printList(placeToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String>linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); //??????????????????/
        while(stringListIterator.hasNext()) {
            int comparioson = stringListIterator.next().compareTo(newCity);
            if(comparioson == 0) {
                //equal do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if(comparioson > 0) {
                //new city should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
            }
            else if(comparioson < 0) {
                //move on
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
