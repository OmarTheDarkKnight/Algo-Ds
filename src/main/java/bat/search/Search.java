package bat.search;

public class Search {
    int counter;
    int[] list;

    public Search() {
        counter = 0;
    }

    public Search(int[] list) {
        this.list = list;
    }

    public void targetFoundPrinter(int position) {
        System.out.println("Target found at position : " + position + "\n*********************************\n");
    }

    public void targetNotFoundPrinter() {
        System.out.println("Target not found in list.\n*********************************\n");
    }

    public void linearSearch(int target) {
        System.out.println("\n******* Linear Search *********");
        new LinearSearch().linearSearch(target);
    }

    public void binarySearch(int target) {
        System.out.println("\n******* Binary Search *********");
        new BinarySearch().binarySearch(target);
    }

    public void recursive_binarySearch(int target) {
        System.out.println("\n******* Recursive Binary Search *********");
        new BinarySearch().recursive_binarySearch(list, target, 0, counter);
    }
}
