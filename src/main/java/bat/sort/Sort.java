package bat.sort;

public class Sort {
    public int[] list;

    Sort(int[] list) {
        this.list = list;
    }

    public void listPrinter() {
        for(int item : this.list)
            System.out.print(item + " -> ");
        System.out.println("END" + "\n*********************************\n");
    }

    public void swap(int index1, int index2) {
        int temp = this.list[index1];
        this.list[index1] = this.list[index2];
        this.list[index2] = temp;
    }

    public static void bubbleSort(int[] list) {
        System.out.println("\n******* Bubble Sort *********");
        new BubbleSort(list).bubbleSort();
    }

    public static void recursive_bubbleSort(int[] list) {
        System.out.println("\n******* Recursive Bubble Sort *********");
        new BubbleSort(list).recursive_bubbleSort(list, list.length);
    }

    public static void selectionSort(int[] list) {
        System.out.println("\n******* Selection Sort *********");
        new SelectionSort(list).selectionSort();
    }

    public static void insertionSort(int[] list) {
        System.out.println("\n******* Insertion Sort *********");
        new InsertionSort(list).insertionSort();
    }

    public static void mergeSort(int[] list) {
        System.out.println("\n********* Merge Sort ***********");
        new MergeSort(list).mergeSort();
    }

    public static void quickSort(int[] list) {
        System.out.println("\n********* Quick Sort ***********");
        new QuickSort(list).quickSort();
    }
}
