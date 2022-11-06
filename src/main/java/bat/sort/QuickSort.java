package bat.sort;

public class QuickSort extends Sort {
    QuickSort(int[] list) { super(list); }

    /**
     * Uses divide and conquer approach to sort the given list
     * It's not stable, meaning the equivalent members' order is not preserved during sorting
     *
     * A random pivot point is selected (usually it's the last position of the list)
     * Then all the members less than the pivot goes to the left,
     * All the members larger than the pivot goes to the right of the pivot.
     * Then the list is divided into 2 sub-lists
     * And this approach is continued till the list is sorted
     *
     * Time complexity O(n log n)
     * Space complexity O(log n)
     * */
    public void quickSort() {
        quickSort( 0, list.length-1);
        listPrinter();
    }

    /**
     * Partition index is supplied by the sort() method
     * The list is divided into 2 sub-lists at the partition index
     * */
    private void quickSort(int begin, int end) {
        if(begin < end) {
            int partitionIdx = sort( begin, end);
            quickSort(begin, partitionIdx - 1);
            quickSort(partitionIdx + 1, end);
        }
    }

    /**
     * Selects the las member as the pivot
     * Anything smaller than the pivot exchanges place
     * With the current loop position
     * This puts the pivot at the right place in the list
     * This position is the partition index for the list
     * */
    private int sort( int begin, int end) {
        int pivot = list[end];
        int smallerIdx = begin - 1;

        for(int i = begin; i < end; i++) {
            if(list[i] <= pivot) {
                swap(++smallerIdx, i);
            }
        }
        swap(++smallerIdx, end);
        return smallerIdx;
    }
}
