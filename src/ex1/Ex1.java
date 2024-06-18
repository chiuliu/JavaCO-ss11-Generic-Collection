package ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.floor(Math.random() * 100)));
        }
        System.out.println("Before sorting: " + list);
        Integer max = Collections.max(list);


        System.out.println(max);


        //reserve

        Collections.reverse(list);

        System.out.println("Reverse: " + list);

        // sort

        Collections.sort(list);

        System.out.println("Sort" + list);

        //addAll




    }
}
