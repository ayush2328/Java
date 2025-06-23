import java.util.*;
import java.util.Scanner;

public class basic_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int x = sc.nextInt();
        int a[] = new int[x];
        System.out.printf("Enter the 5 elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.printf("Output is: ");
        for (int j : a) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }
}