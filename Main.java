package com.company;
import java.util.Arrays;
import javax.swing.text.Document;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Documents doc1=new Documents(5,"titre1", new String[]{"salam"},"edit1",2001,5);
        System.out.println(doc1.toString());
        Documents doc2=new Documents(5,"titre2", new String[]{"3alikom"},"edit2",2002,8);
        System.out.println(doc2.toString());
    }
}
