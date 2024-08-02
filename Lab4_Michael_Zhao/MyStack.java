package Lab4_Michael_Zhao;

public class MyStack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    public MyStack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }
        stackArray[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stackArray[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public void clear() {
        top = -1;
    }

    public void reverse() {
        T[] temp = (T[]) new Object[maxSize];
        int i = 0;
        while (!isEmpty()) {
            temp[i++] = pop();
        }
        stackArray = temp;
        top = i - 1;
    }

    public void sort() {
        // This method assumes the elements are comparable
        if (top < 1) return;
        for (int i = 0; i <= top; i++) {
            for (int j = i + 1; j <= top; j++) {
                if (((Comparable<T>) stackArray[i]).compareTo(stackArray[j]) > 0) {
                    T temp = stackArray[i];
                    stackArray[i] = stackArray[j];
                    stackArray[j] = temp;
                }
            }
        }
    }

    public void insertAtBottom(T element) {
        if (isEmpty()) {
            push(element);
            return;
        }
        T temp = pop();
        insertAtBottom(element);
        push(temp);
    }

    public void reverseRecursively() {
        if (isEmpty()) {
            return;
        }
        T temp = pop();
        reverseRecursively();
        insertAtBottom(temp);
    }

    public void sortRecursively() {
        if (isEmpty()) {
            return;
        }
        T temp = pop();
        sortRecursively();
        insertInSortedOrder(temp);
    }

    public void insertInSortedOrder(T element) {
        if (isEmpty() || ((Comparable<T>) element).compareTo(stackArray[top]) >= 0) {
            push(element);
            return;
        }
        T temp = pop();
        insertInSortedOrder(element);
        push(temp);
    }

    public void displayRecursively() {
        if (isEmpty()) {
            return;
        }
        T temp = pop();
        displayRecursively();
        System.out.print(temp + " ");
        push(temp);
    }

    public void clearRecursively() {
        if (isEmpty()) {
            return;
        }
        pop();
        clearRecursively();
    }

    public void reverseRecursivelyDriver() {
        reverseRecursively();
        display();
    }
}


