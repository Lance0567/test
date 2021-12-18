package Java8Features.ParalelArraySorting;

import java.util.Arrays;

public class ParallelArraySorting2 {
    public static void main(String[] args) {
        int[] arr = {5,8,1,0,6,9,50,-3};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        // Sorting array elements parallel and passing start, end index
        Arrays.parallelSort(arr, 0,4);
        System.out.println("\n Array elements after sorting");

        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
