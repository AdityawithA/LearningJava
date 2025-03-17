package com.content.java.oops.collections;

 class Newnode {
    int data;
    Newnode next;


    private static Newnode add(int data, Newnode head){
        Newnode valueNode = new Newnode();
        valueNode.data=data;
        Newnode currentNode = head;
        if(head.next==null){
            head.next = valueNode;
            currentNode = valueNode;
        }else{
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=valueNode;
        }
        return head;
    }

    private static String remove(int data, Newnode head){
        if(head == null){
            return "List is empty";
        }else{
            Newnode currentNode = head;
            while(currentNode.next.data != data){
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        return "Node removed";
    }
    private static void disPlay(Newnode head){
        if(head==null){
            System.out.println("Linked list is empty");
        }else{
            Newnode currentNode = head;
            while (currentNode!=null){
                System.out.print(currentNode.data +" -> ");
                currentNode=currentNode.next;
            }
        }

    }

    public static void main(String[] args) {
        Newnode head = new Newnode();
        for (int i = 0;i < 10; i++){

            Newnode.add(i,head);

        }
        Newnode.add(10,head);
        Newnode.add(99,head);
        Newnode.add(5000,head);
        Newnode.add(303,head);
        Newnode.add(1080,head);
        Newnode.add(911,head);


        System.out.println("list before deletion");

        Newnode.disPlay(head);

       Newnode.remove(5000,head);
        System.out.println("\nlist after deletion");
        Newnode.disPlay(head);
    }

}



