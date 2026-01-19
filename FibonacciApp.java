public class FibonacciApp {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // F(0)=0, F(1)=1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int term = fibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + term + ".");
    }
}
