package List_and_ArrayList_Part_3_9;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumber = new int[50];
    private ArrayList<String> groceyList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceyList.add(item);
    }

    //Only getter added at part 3
    public ArrayList<String> getGroceyList() {
        return groceyList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceyList.size() + " items in your grocery list");
        for(int i = 0; i < groceyList.size(); i++)
            System.out.println((i + 1) + " . " + groceyList.get(i));
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceyList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceyList.get(position);
        groceyList.remove(position);
    }

    public String findItem(String searchItem) {
        //boolean exits = groceyList.contains(searchItem);
        int position = groceyList.indexOf(searchItem);
        if(position >= 0)
            return groceyList.get(position);
        else
            return null;
    }
}
