package bat.search;

import java.util.Arrays;

public class BinarySearch extends Search {
    BinarySearch(int[] list) {super(list);}

    /**
     * Binary search -> Searches through the list by splitting it in half
     *
     * step 1 : go to the middle position of the list
     * step 2 : check if the target if larger or smaller than that value
     * step 3 : If the target is larger discard the left half of the list and continue from step 1
     * If the target is smaller, discard the right half and work on the left half from step 1
     * Continue until the target is found
     *
     * The list needs to sorted
     * Time complexity O(log n)
     * */
    public void binarySearch(int target) {
        int first = 0;
        int last = list.length - 1;
        int half;
        while(first <= last) {
            half = (int) Math.floor((double)((first + last) / 2));
            if(list[half] == target) {
                targetFoundPrinter(half);
                return;
            }
            else if(target > list[half])
                first = half + 1;
            else if(target < list[half])
                last = half - 1;

        }
        targetNotFoundPrinter();
    }

    /**
     * Same as Binary search except it is done recursively
     * Tow extra parameters are used
     *
     * @param prevHalf cascades the midpoint value for the prev iteration to keep track of the position of the target
     * */
    public void recursive_binarySearch(int[] list, int target, int prevHalf) {
        int first = 0;
        int last = list.length - 1;
        if(list.length > 0) {
            int half = (int) Math.floor((double)((first + last) / 2));
            if(list[half] == target) {
                targetFoundPrinter(prevHalf);
            }
            else if(target > list[half])
                recursive_binarySearch(Arrays.stream(list, half + 1, list.length).toArray(),
                        target, prevHalf + half+1);

            else if(target < list[half])
                recursive_binarySearch(Arrays.stream(list, first, half).toArray(),
                        target, prevHalf);

        } else {
            targetNotFoundPrinter();
        }
    }
}
