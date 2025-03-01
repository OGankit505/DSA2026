package LinkedList;

public class LinkedList {
    //creation of a node
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size; // to get the size of the linked list

    // for adding element at the beginning of the linked list
    public void addFirst(int data){
        Node newNode = new Node(data); // create a new node
        size++;
       //if the linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head; // point the next of the new node to the head
        head =  newNode; // make the new node as head
    }

    //for adding elements at the last of the linked list
    public void addLast(int data){
        Node newNode = new Node(data); //create a new node
        size++;
        //if the linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // point the next of tail to the new node
        tail = newNode; // make the new node as tail
    }

    //for printing the elements of Linked List
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //for adding elements in the middle of the linked list
    public void addMid(int index, int data){
        if(index == 0){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp =  head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next =  temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(2);
        l.addFirst(1);
        l.addLast(3);
        l.addLast(4);
        l.addMid(3,7);
        l.print();
        System.out.println(l.size);
    }
}
