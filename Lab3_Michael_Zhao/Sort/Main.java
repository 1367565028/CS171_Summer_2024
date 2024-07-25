package Lab3_Michael_Zhao.Sort;

public class Main {
    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();

        int[] array = {1, 88, 6, 99, 11, 5};

        System.out.print("Original array: ");
        insertionSort.printArray(array);

        insertionSort.sort(array);

        System.out.print("Sorted array: ");
        insertionSort.printArray(array);

        System.out.println("Sorting algorithm: " + insertionSort.getName());

        insertionSort.doMagic();
    }
}
