package Lists;



class Node {
    int data;
    Node next;
    Node prev;
}

class DoublyLinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
            current = current.next;
        }
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (head == null) return;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data);
            if (current.prev != null) {
                System.out.print(" <-> ");
            }
            current = current.prev;
        }
        System.out.println();
    }
}

class NewDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Forward Traverse:");
        list.displayForward();

        System.out.println("Backward Traverse:");
        list.displayBackward();
    }
}

