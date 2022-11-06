package bat;

import bat.search.Search;
import bat.sort.Sort;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLimit, target;
//        maxLimit = sc.nextInt();
        maxLimit = 10;
        int[] list = new int[maxLimit];
        for (int i = 0; i < maxLimit; i++)
            list[i] = i+1;
//        target = sc.nextInt();
        target = 11;

        Search.linearSearch(list, target);
        Search.binarySearch(list, target);
        Search.recursive_binarySearch(list, target);

        list = new int[]{8, 9, 58, 52, 7, 36, 1, 28, 14, 75, 7, 6, 10};
        Sort.bubbleSort(list);
        Sort.selectionSort(list);
        Sort.insertionSort(list);
        Sort.mergeSort(list);
        Sort.quickSort(list);
    }
}
