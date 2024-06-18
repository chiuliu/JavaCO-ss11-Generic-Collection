package ex6;

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,5,4,4,1,7,7,9,6,8));
        System.out.println("before : " + list);
        Set<Integer> newArr = new LinkedHashSet<>(list);
        System.out.println("after : " + newArr);
    }
}
