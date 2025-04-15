package Structures;

public class MyLinkedList {
    private class Node{
        private int data = 0;
        private Node next = null;

         public Node(int data){
             this.data = data;
             this.next = null;
         }
    }

    private Node head;
    private Node tail;


    public void addNewHead(int element){//O(1) вставка в начало
        Node node = new Node(element);
        if (this.head == null){
            this.tail = node;
        } else {
            node.next = head;
        }
        this.head = node;
    }

    public void addNewTail(int element){//O(1) вставка в конец
        Node node = new Node(element);
        if (this.tail == null){
            this.head = node;
        } else {
            this.tail.next =  node;
        }
        this.tail = node;
    }

    public void insert(int after, int element){//O(n) вставка в середину
        Node search = this.head;
        while (search != null){
            if (search.data == after){
                break;
            }
            search = search.next;
        }
        if (search != null){
            Node node = new Node(element);
            if  (search == this.tail){
                this.tail = node;
            }
            node.next  = search.next;
            search.next = node;
        }
    }

    public Node search(int element){//O(n) поиск элемента
        Node current = this.head;
        while (current != null){
            if (current.data == element){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printList(){
        Node current = this.head;
        int i = 0;
        while (current != null){
            i++;
            System.out.printf("%d:%d\n",i , current.data);
            current = current.next;
        }
    }

}
