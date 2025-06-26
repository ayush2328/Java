import java.util.Scanner;

public class TwoD_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a[][] = new int[x][y];

        System.out.printf("Enter %d number of elements: ", x * y);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Given 2D Array is : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
