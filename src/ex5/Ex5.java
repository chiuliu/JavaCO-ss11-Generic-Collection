package ex5;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,5,4,1,7,9,6,8));

        for (int i = 0; i < list.size() -1  ; i++) {
          for (int j = i+1; j < list.size()   ; j++) {

              if (list.get(j)<list.get(i)) {
                  Integer temp = list.get(i);
                  list.set(i, list.get(j));
                  list.set(j, temp);
              }
          }


        }
        System.out.println(list);

    }
}