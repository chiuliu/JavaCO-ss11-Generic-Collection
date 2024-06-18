package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        String str = "Rikkei Academy để nông dân biết code";

        String[] arrString = str.split(" ");

        List<String> arrList = new ArrayList<>(Arrays.asList(arrString));

        System.out.println(arrList);

        for (String s: arrList){
            if (s.length()>3){
                System.out.println(s);
            }
        }



    }

}
