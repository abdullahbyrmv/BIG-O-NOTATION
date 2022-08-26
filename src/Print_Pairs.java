import java.util.Scanner;

public class Print_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Size of Array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please Enter " + i + "th Element of Array : ");
            array[i] = sc.nextInt();
        }
        printPairs(array);// O(n^2)
    }

    public static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {// O(N)
            for (int j = 0; j < array.length; j++) {// O(N)
                System.out.println(array[i] + " " + array[j]);// O(1)
            }
        }
    }
}
