import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);// O(n)
    }

    public static int factorial(int n) {// M(n)
        if (n < 0) {// O(1)
            return -1;// O(1)
        } else if (n == 0) {// O(1)
            return 1;// O(1)
        } else {
            return n * factorial(n - 1);// M(n - 1)
        }
    }
}
