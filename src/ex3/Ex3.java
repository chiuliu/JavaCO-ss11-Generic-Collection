package ex3;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {

        String str = "Rikkei Academy để nông dân biết code";
        String[] arrString = str.split(" ");
        List<String> arr = new ArrayList<String>(Arrays.asList(arrString));

//        String min = Collections.min(arr , Comparator.comparing(String::length));
//
//        System.out.println(min);
        String min = arr.get(0);

        for (String s : arr) {


            if (min.length() > s.length()) {
                min = s;
            }


        }
        System.out.println(min);

    }
}
