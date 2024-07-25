package Lab3_Michael_Zhao.Sort;

public class InsertionSort extends SortAlgorithm implements ArrayPrinter {

    @Override
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    @Override
    public void swap(int[] array, int i, int j) {
        super.swap(array, i, j);
        System.out.println("Swapping " + array[i] + " and " + array[j]);
    }

    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    public void doMagic() {
        System.out.println("Performing magic in Insertion Sort!");
    }
}
