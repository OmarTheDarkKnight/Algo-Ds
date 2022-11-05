package bat;

import bat.search.Search;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLimit, target;
//        maxLimit = sc.nextInt();
        maxLimit = 10;
        int[] list = new int[maxLimit];
        for (int i = 0; i < maxLimit; i++)
            list[i] = i+1;
//        target = sc.nextInt();
        target = 11;

        Search search = new Search(list);
        search.linearSearch(target);
        search.binarySearch(target);
        search.recursive_binarySearch(target);
    }
}
