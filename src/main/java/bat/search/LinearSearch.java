package bat.search;

class LinearSearch extends Search {
    LinearSearch(int[] list) {super(list);}

    /**
     * Linear search -> Searches through the list one by one
     *
     * Start at the beginning of the list and iterate through it until the target is found
     *
     * No sorting of data is required
     * Time complexity O(n)
     * */
    public void linearSearch(int target) {
        for(int i=0; i < list.length; i++) {
            if(list[i] == target){
                targetFoundPrinter(i);
                return;
            }
        }
        targetNotFoundPrinter();
    }
}
