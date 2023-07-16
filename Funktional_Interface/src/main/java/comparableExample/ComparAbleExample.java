/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparableExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author roman
 */
public class ComparAbleExample {

    public static void main(String[] args) {

        int n = 4;
        Pair arr[] = new Pair[n];

        arr[0] = new Pair("abc", 3);
        arr[1] = new Pair("a", 4);
        arr[2] = new Pair("bc", 5);
        arr[3] = new Pair("a", 2);


        // Sorting the array
        Arrays.sort(arr);

        // printing the
        // Pair array
        print(arr);

        System.out.println("--------------------------------------------");


        Pair2 arr2[] = new Pair2[n];

        arr2[0] = new Pair2("abc", 3);
        arr2[1] = new Pair2("a", 4);
        arr2[2] = new Pair2("bc", 5);
        arr2[3] = new Pair2("a", 2);

        Arrays.sort(arr);
        print(arr);

        List<String> liste = new ArrayList<>();
        liste.add("Hello World!");
        liste.add("Hello World!");
        liste.add("Hello World!");
        liste.add("Hello World!");
        
        ListIterator<String> listIterator = liste.listIterator();


        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }



    }

    public static void print(Pair[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

class Pair implements Comparable<Pair> {

    String x;
    int y;

    public Pair(String x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Pair a) {
        // if the string are not equal
        if (this.x.compareTo(a.x) != 0) {
            return this.x.compareTo(a.x);
        } else {
            // we compare int values
            // if the strings are equal
            return this.y - a.y;
        }
    }
}

class Pair2 {

    String x;
    int y;

    public Pair2(String x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
