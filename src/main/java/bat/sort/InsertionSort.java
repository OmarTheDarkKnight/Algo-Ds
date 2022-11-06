package bat.sort;

public class InsertionSort extends Sort{
    InsertionSort(int[] list) {super(list);}

    /**
     * This algorithm mimics that
     * The numbers were being sorted as they were being inserted
     * Hence the name insertion sort
     *
     * Finds the position where the number should go
     * Shifts the list by 1 position from [position+1]
     * Moves the number in list[position]
     *
     * Useful when the list is almost sorted or the list is very small
     *
     * Best case scenario O(n)
     * Time Complexity O(n^2)
     * Space Complexity
     * */
    public void insertionSort() {
        for (int i = 1; i < list.length; i++) {
            // Assume list[i] is the max
            // Goal is to put max in it's correct position
            int max = list[i];

            // Start from one position before where current max is
            int j = i - 1;

            // Keep shifting the list right the current max is greater than list[j]
            // While going backwards
            while (j >= 0 && list[j] > max) {
                list[j + 1] = list[j];
                j--;
            }
            // put current max in the proper position
            list[j + 1] = max;
        }
        listPrinter();
    }
}
