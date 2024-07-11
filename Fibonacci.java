package sort;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    static int fibo(int n) { // for printing nth fibonacci number

        if (n < 2) { // base condition
            return n;
        }
        return fibo(n - 1) + fibo(n - 2); // recurrance relation
    }
}
