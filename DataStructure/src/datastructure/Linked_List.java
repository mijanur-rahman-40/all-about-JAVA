package datastructure;

import java.util.LinkedList;

class Node {

    int data;
    Node next;
}

class LinkedListOperation {

    Node head;

    public void insert(int _data) {
        Node new_node = new Node();
        new_node.data = _data;
        new_node.next = null;

        if (head == null) {
            head = new_node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class Linked_List {

    public static void main(String[] args) {
        /*        
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3, 12);
        list.remove()
         */
        LinkedListOperation list = new LinkedListOperation();
        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.insertAtStart(25);
        list.insertAt(2, 55);
        list.show();
    }
}
