package bat.search;

import java.util.stream.IntStream;

public class BinarySearch extends Search {
    BinarySearch() {
        super();
    }

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
            System.out.println("Iteration : " + ++counter);
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
     * @param counter is used to keep track if the number of iteration.
     * @param prevHalf cascades the midpoint value for the prev iteration to keep track of the position of the target
     * */
    public void recursive_binarySearch(int[] list, int target, int prevHalf, int counter) {
        int first = 0;
        int last = list.length - 1;
        if(list.length > 0) {
            int half = (int) Math.floor((double)((first + last) / 2));
            System.out.println("Iteration : " + ++counter);
            if(list[half] == target) {
                targetFoundPrinter(prevHalf);
                return;
            }
            else if(target > list[half])
                recursive_binarySearch(IntStream.range(half+1, list.length).map(i -> list[i]).toArray(),
                        target, prevHalf + half+1, counter);

            else if(target < list[half])
                recursive_binarySearch(IntStream.range(first, half).map(i -> list[i]).toArray(),
                        target, prevHalf, counter);

        } else {
            targetNotFoundPrinter();
        }
    }
}
