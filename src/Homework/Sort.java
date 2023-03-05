package Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> listToSort = getListFilledByRandom(0, 100_000, 100_000);


        long time = System.currentTimeMillis();

        bubbleSort(listToSort);
        System.out.println(listToSort);

        System.out.println(System.currentTimeMillis() - time);


    }


    // about 7 minutes for 300_000
    public static void bubbleSort(ArrayList<Integer> listToSort) {
        for (int i = 0; i < listToSort.size() - 1; i++) {
            for (int j = 0; j < listToSort.size() - i - 1; j++) {
                if (listToSort.get(j + 1) < listToSort.get(j)) {
                    listToSort.set(j, listToSort.set(j + 1, listToSort.get(j))); // set returns the old value (Collections.swap realization)
                }
            }
        }
    }

    // !TODO shakerSort



    public static ArrayList<Integer> getListFilledByRandom(int fromNum, int toNum, int length) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int randomNumber = (int) (fromNum + Math.random() * toNum);
            list.add(randomNumber);
        }

        return list;
    }

}
