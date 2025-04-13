package book;

import java.util.Scanner;

public class Book {
    String name= "";
    String author = "";
    int strCount = 0;
    boolean documentary = false;

    public Book(String name,  String author, int strCount, boolean documentary){
        this.name = name;
        this.author = author;
        this.strCount = strCount;
        this.documentary = documentary;
    }

    public void printStringCount(){
        System.out.println(this.strCount*40);
    }
    public void printStringCount(int oneStrCount){
        System.out.println(this.strCount*oneStrCount);
    }
    public void printInformation(){
        System.out.printf("%s от %s - %s",  this.name, this.author, this.documentary?"документальная":"недокументальная");
    }

}
