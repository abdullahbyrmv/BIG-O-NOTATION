import java.util.Scanner;

public class Sum_and_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Size of Array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please Enter " + i + "th Element of Array : ");
            array[i] = sc.nextInt();
        }
        function(array);// Time Complexity is O(N)
    }

    public static void function(int[] array) {
        int sum = 0; // O(1)
        int product = 1;// O(1)
        for (int i = 0; i < array.length; i++) {// O(n)
            sum += array[i];// O(1)
            product *= array[i];// O(1)
        }
        System.out.print("Sum = " + sum + "\n" + "Product = " + product);// O(1)
    }
}
