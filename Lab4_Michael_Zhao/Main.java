package Lab4_Michael_Zhao;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> intStack = new MyStack<>(3);

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println(intStack.peek()); // Outputs: 30

        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        intStack.pop(); // Outputs: Stack is empty.

        MyStack<String> strStack = new MyStack<>(2);

        strStack.push("Hello");
        strStack.push("World");

        System.out.println(strStack.peek()); // Outputs: World

        while (!strStack.isEmpty()) {
            System.out.println(strStack.pop());
        }

        strStack.pop(); // Outputs: Stack is empty.
    }
}
