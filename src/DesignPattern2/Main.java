package DesignPattern2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Context c = new Context(new BubbleSort());
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 8, 7, 3, 5, 2, 1));
        //set order flag to true for ascending order
        //c.executeStrategy(list, true);

        c = new Context(new SelectionSort());
        c.executeStrategy(list, false);

        list.forEach(element -> System.out.print(element + " "));
    }

}
