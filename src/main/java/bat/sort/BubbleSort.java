package bat.sort;

public class BubbleSort extends Sort{
    public BubbleSort(int[] list) {super(list);}

    /**
     * Bubble sort is the simplest of all the sorting algorithms
     * It takes a pair and compares till the whole list is sorted
     *
     * Time complexity O(n^2)
     * Space complexity O(1)
     * */
    public void bubbleSort() {
        boolean swapped = false;
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length-1; j++)
                if(list[j] > list[j+1]) {
                    swap(j, j+1);
                    swapped = true;
                }
            // if the inner loop never made any swap that means the list is already sorted
            // No further need to run through the outer loop
            if (!swapped)
                break;
        }
        listPrinter();
    }

    /**
     * Same principle as the bubble sort
     * The largest number is placed as the last item of the list
     * Then the recursive call is made with the rest of the members of the list
     * When the length is 0 or 1, the recursion ends
     * */
    public void recursive_bubbleSort(int[] list, int n) {
        if(n <= 1) {
            listPrinter();
            return;
        }

        for(int i = 0; i < n; i++)
            if(list[i] > list[i+1])
                swap(i, i+1);
        recursive_bubbleSort(list, n - 1);
    }
}
