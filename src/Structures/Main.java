package Structures;

public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray(5);
        arr.append(3);
        arr.append(5);
        arr.append(45);
        System.out.println(arr.printArr());
        System.out.println("-------------------------------------");
        DynamicArray aar2 = new DynamicArray(2);
        aar2.append(6);
        aar2.append(67);
        aar2.append(8);
        aar2.append(67);
        aar2.append(8);
        aar2.append(67);
        aar2.append(8);
        System.out.println(aar2.get(5));
        System.out.println(aar2.printArr());
        System.out.println("-------------------------------------");
        MyLinkedList list = new MyLinkedList();
        list.addNewHead(2);
        list.addNewTail(37);
        list.addNewTail(67);
        list.addNewTail(45);
        list.insert(67,34);
        list.printList();
        System.out.println("-------------------------------------");
        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.append_front(3);
        list2.append_front(54);
        list2.append_back(72);
        list2.append_back(38);
        list2.append_back(22);
        list2.printList();

    }
}
