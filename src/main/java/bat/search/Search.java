package bat.search;

public class Search {
    int[] list;

    Search(int[] list) {
       this.list = list;
    }

    public void targetFoundPrinter(int position) {
        System.out.println("Target found at position : " + position + "\n*********************************\n");
    }

    public void targetNotFoundPrinter() {
        System.out.println("Target not found in list.\n*********************************\n");
    }

    public static void linearSearch(int[] list, int target) {
        System.out.println("\n******* Linear Search *********");
        new LinearSearch(list).linearSearch(target);
    }

    public static void binarySearch(int[] list, int target) {
        System.out.println("\n******* Binary Search *********");
        new BinarySearch(list).binarySearch(target);
    }

    public static void recursive_binarySearch(int[] list, int target) {
        System.out.println("\n******* Recursive Binary Search *********");
        new BinarySearch(list).recursive_binarySearch(list, target, 0);
    }
}
