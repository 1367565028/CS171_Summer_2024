package Lab3_Michael_Zhao.Sort;

public class BubbleSort extends SortAlgorithm implements ArrayPrinter {
    // @Override
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Using the swap method from the abstract class
                    swap(array, j, j + 1);
                }
            }
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
        return "Bubble Sort";
    }

    @Override
    public void doMagic() {
        // TODO Auto-generated method stub
        // This was answer to a question in the class. You don't need to do anything with this method. 
        // However, you can be  creative! Do any magic you want on the sort algorithm. 
        throw new UnsupportedOperationException("Unimplemented method 'doMagic'");
    }
}
