package bat.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSort extends Sort {
    MergeSort(int[] list) { super(list); }

    /**
     * Uses divide and conquer approach to sort the given list
     * It is stable, so it keeps the original order the equivalent items
     *
     * Time complexity O(n log n)
     * Space complexity O(n)
     * */
    public void mergeSort() {
        split(this.list);
        listPrinter();
    }

    public int[] split(int[] list) {
        if(list.length <= 1) {
            return list;
        }

        // Split the list into half
        int mid = (int) Math.floor((double)list.length / 2);
        int[] left = Arrays.copyOfRange(list, 0, mid);
        int[] right = Arrays.copyOfRange(list, mid, list.length);

        return sortAndMerge(split(left), split(right));
    }

    private int[] sortAndMerge(int[] left, int[] right){
        List<Integer> result = new ArrayList<>();
        int leftIdx = 0;
        int rightIdx = 0;

        while(leftIdx < left.length && rightIdx < right.length) {
            if(left[leftIdx] < right[rightIdx])
                result.add(left[leftIdx++]);
            else result.add(right[rightIdx++]);
        }

        // Add the rest of the items to the result List
        result.addAll(Arrays.stream(left, leftIdx, left.length).boxed().collect(Collectors.toList()));
        result.addAll(Arrays.stream(right, rightIdx, right.length).boxed().collect(Collectors.toList()));

        return result.stream().mapToInt(i -> i).toArray();
    }
}
