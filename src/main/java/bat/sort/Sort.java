package bat.sort;

public class Sort {
    int[] list;

    public Sort() {}

    public Sort(int[] list) {
        this.list = list;
    }

    public void listPrinter() {
        for(int item : list)
            System.out.println(item + " -> ");
        System.out.println("END" + "\n*********************************\n");
    }

    public void swap(int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public void bubbleSort() {
        System.out.println("\n******* Bubble Sort *********");
        new BubbleSort().bubbleSort();
    }

    public void recursive_bubbleSort() {
        System.out.println("\n******* Recursive Bubble Sort *********");
        new BubbleSort().recursive_bubbleSort(list, list.length);
    }
}
