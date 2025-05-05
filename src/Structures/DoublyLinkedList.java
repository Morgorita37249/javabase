package Structures;

public class DoublyLinkedList {
    private class Node{
        private int data = 0;
        private Node next = null;
        private Node prev = null;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private DoublyLinkedList.Node head;


    public void append_front(int data){//O(1) вставка в начало
        Node new_node = new Node(data);
        if (this.head == null){
            this.head = new_node;

        } else {
            new_node.next = this.head;
            this.head.prev = new_node;
            this.head = new_node;
        }
    }

    public void append_back(int data){
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
        } else {
            Node curr_node = this.head;
            while(curr_node.next!= null){
                curr_node = curr_node.next;
            }
            curr_node.next = new_node;
            new_node.prev = curr_node;
        }
    }
    public void printList(){//O(n) вставка в конец
        DoublyLinkedList.Node current = this.head;
        int i = 0;
        while (current != null){
            i++;
            System.out.printf("%d:%d\n",i , current.data);
            current = current.next;
        }
    }
}
