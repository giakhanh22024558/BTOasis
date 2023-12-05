package DesignPattern2;

import java.util.ArrayList;

public class SelectionSort implements Strategy {

    /**
     * perform selection sort
     * @param list list to sort
     * @param order flag to know sorting order
     */
    @Override
    public void performSorting(ArrayList<Integer> list, boolean order) {
        if (order) {
            int n = list.size();

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the minimum element in the unsorted part of the ArrayList
                for (int j = i + 1; j < n; j++) {
                    if (list.get(j) < list.get(minIndex)) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element
                int temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        } else {
            int n = list.size();

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the minimum element in the unsorted part of the ArrayList
                for (int j = i + 1; j < n; j++) {
                    if (list.get(j) > list.get(minIndex)) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element
                int temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
    }
}
