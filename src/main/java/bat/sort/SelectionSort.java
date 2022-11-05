package bat.sort;

public class SelectionSort extends Sort{
    public SelectionSort(int[] list) {super(list);}

    /**
     * Step 1 : selects the first item of the list
     * Step 2 : swaps it with the smallest item in the unsorted list
     * Step 3 : moves on to the next item and continues step 2 till the list is sorted
     *
     * Time complexity O(n^2)
     * Space complexity O(1)
     * */
    public void selectionSort() {
        for(int i = 0; i < list.length - 1; i++) {
            int min = i;
            // finds the smallest item from i+1 to list.length
            for(int j = i + 1; j < list.length; j++)
                if(list[min] > list[j])
                    min = j;
                // swaps it with the selected item
                swap(i, min);
        }
        listPrinter();
    }
}
