package LinkListPart_3_20;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<String>();

        addInOrder(placeToVisit ,"Sydney"); //is this pass the reference or value
        addInOrder(placeToVisit ,"Melbourne");
        addInOrder(placeToVisit ,"Brisbane");
        addInOrder(placeToVisit ,"Perth");
        addInOrder(placeToVisit ,"Canberra");
        addInOrder(placeToVisit ,"Adelaide");
        addInOrder(placeToVisit ,"Darwin");
        printList(placeToVisit);

        addInOrder(placeToVisit, "Alice Springs");
        addInOrder(placeToVisit, "Darwin");
        printList(placeToVisit);

        visit(placeToVisit);

        /*
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
        */
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
                return true;
            }
            else if(comparioson < 0) {
                //move on
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No city has to visit");
            return;
        }
        else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext())
                        System.out.println("Now visiting " + listIterator.next());
                    else {
                        System.out.println("Reach the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious())
                        System.out.println("Now visting " + listIterator.previous());
                    else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions are\npress");
        System.out.println("0 - quit\n" +
                           "1 - go to next city\n" +
                           "2 - go to previous city\n" +
                           "3 - print menu option\n");
    }
}
