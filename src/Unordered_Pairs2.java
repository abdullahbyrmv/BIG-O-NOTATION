import java.util.Scanner;

public class Unordered_Pairs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Size of array1 : ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Please Enter " + i + "th Element of array1 : ");
            array1[i] = sc.nextInt();
        }
        System.out.print("Please Enter Size of array2 : ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Please Enter " + i + "th Element of array2 : ");
            array2[i] = sc.nextInt();
        }
        printPairs(array1, array2);// O( a * b )
    }

    public static void printPairs(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {// O ( a * b)
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < 100000; k++) {// O( 1 )
                    System.out.println(array1[i] + " " + array2[j]);// O( 1 )
                }
            }
        }
    }
}
