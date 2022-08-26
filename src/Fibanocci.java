public class Fibanocci {
    public static void main(String[] args) {
        allFibonacci(10);// O( 2 ^ n)
    }

    static void allFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            int res = fibonacci(i);
            System.out.println(res);
        }
    }

    static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
