package DesignPattern2;

import java.util.ArrayList;

public class BubbleSort implements Strategy {

    /**
     * perform bubble sort
     * @param list list to sort
     * @param order flag to know sorting order
     */
    @Override
    public void performSorting(ArrayList<Integer> list, boolean order) {
        if (order) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        // Swap elements using set method
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if (list.get(j) < list.get(j + 1)) {
                        // Swap elements using set method
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }
    }

}
