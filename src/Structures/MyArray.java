package Structures;

public class MyArray {
    private int[] data;
    private int size;
    private int capacity;

    public MyArray(int capacity){
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    public int get(int index){//O(1)
        return this.data[index];
    }

    public void append(int element){//O(1)

        if (size < capacity){
            data[size] = element;
            size++;
        } else {
            System.out.println("Место в массиве закончилось");
        }
    }
    public void remove(int index){//удаление элемента из массива //O(n)
        int[] new_data = new int[capacity-1];
        for (int i = 0; i < size-1; i++) {
            if (data[i]!=data[index])
                new_data[i] = data[i];
        }
        data = new_data;

    }
    public StringBuilder printArr(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(data[i] + ",");
        }
        return str;
    }
}
