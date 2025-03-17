package com.content.java.oops.collections;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node() {
    }
}

class Mergedlinkedlist {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Node " + data + " removed");
        } else {
            System.out.println("Node not found");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static LinkedList merge(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null) {
            mergedList.add(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.add(current2.data);
            current2 = current2.next;
        }

        return mergedList;
    }
}

class Newmergedlinkedlist {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        LinkedList list2 = new LinkedList();
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println("List 1:");
        list1.display();

        System.out.println("List 2:");
        list2.display();

        LinkedList mergedList = Mergedlinkedlist.merge(list1, list2);
        System.out.println("Merged List:");
        mergedList.display();
    }
}

