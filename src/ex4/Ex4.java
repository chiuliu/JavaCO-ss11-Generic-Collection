package ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,12, 9, 10));

        List<Integer> eventNumber = new ArrayList<>();

        for (Integer n : numbers){
            if (n % 2 != 0){
                eventNumber.add(n);

            }
            }
            System.out.println(eventNumber);

        }

    }
