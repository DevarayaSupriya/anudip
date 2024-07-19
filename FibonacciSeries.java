package apjfsa;
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        fibonacciSeries(n);
    }

    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        System.out.print(a + " " + b + " "); // Print first two numbers

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
