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
        MyList list = new MyList();



    }
}
