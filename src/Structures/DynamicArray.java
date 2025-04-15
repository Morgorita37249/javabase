package Structures;

public class DynamicArray {
     private int size = 0;
     private int capacity = 0;
     private int [] data  = new int [capacity];

     public DynamicArray(int capacity){
         this.size = 0;
         this.capacity = capacity;
         this.data = new int[capacity];
     }

     public int get(int index){
         return data[index];
     }

     private void resize(){
         int [] new_data = new int[this.capacity*2];
         this.capacity = this.capacity*2;
         for (int i = 0; i < size; i++) {
             new_data[i] = this.data[i];
         }
         this.data = new_data;
     }

     public void append(int element){
         if (size==capacity){
             resize();
         }
         this.data[size] = element;
         size++;
     }

     public StringBuilder printArr(){
         StringBuilder str = new StringBuilder();
         for (int i = 0; i < size; i++) {
             str.append(data[i]+",");
         }
         return str;
     }
}
