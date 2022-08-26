import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Size of Array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please Enter " + i + "th Element of Array : ");
            array[i] = sc.nextInt();
        }
        reverse1(array);
        System.out.println();
        reverse2(array);// O(n)
    }

    public static void reverse1(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverse2(int[] array){
        for(int i = 0 ; i < array.length / 2 ; i++){// O(n/2)
            int other = array.length - i - 1;// O(1)
            int temp = array[i];// O(1)
            array[i] = array[other];// O(1)
            array[other] = temp;// O(1)
        }
        System.out.println(Arrays.toString(array));// O(1)
    }
}
