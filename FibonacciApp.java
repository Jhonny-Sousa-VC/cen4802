public class FibonacciApp {

    /**
     * Computes the nth term of the Fibonacci sequence using recursion.
     * The Fibonacci sequence is defined as F(0)=0, F(1)=1, and
     * F(n)=F(n-1)+F(n-2) for n > 1.
     *
     * @param n the position in the Fibonacci sequence (0 or greater)
     * @return the nth Fibonacci term
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int term = fibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + term + ".");
    }
}
