import java.util.Scanner;

class make_2Darr {
    int x;
    int y;
    int[][] a;

    public make_2Darr(Scanner sc) {

        System.out.print("Enter rows: ");
        x = sc.nextInt();
        System.out.print("Enter columns: ");
        y = sc.nextInt();
        a = new int[x][y];
        System.out.printf("Enter the %d number of elemnts: ", x * y);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = sc.nextInt();
            }
        }

    }

    public void print2dArray() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }

}

public class Add_2Darr extends make_2Darr {

    public Add_2Darr(Scanner sc) {
        super(sc);
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is First Matrix: ");
        Add_2Darr obj1 = new Add_2Darr(sc);
        System.out.println("This is Second Matrix: ");
        Add_2Darr obj2 = new Add_2Darr(sc);
        System.out.printf("First Array: %n");
        obj1.print2dArray();
        System.out.printf("Second Array: %n");
        obj2.print2dArray();

        if (obj1.x != obj2.x || obj1.y != obj2.y) {
            System.out.println("Matrix can't be added: ");
            return;
        }

        int[][] sum = new int[obj1.x][obj1.y];

        for (int i = 0; i < obj1.x; i++) {
            for (int j = 0; j < obj1.y; j++) {
                sum[i][j] = obj1.a[i][j] + obj2.a[i][j];
            }
        }
        System.out.printf("%nResult of Added Matrix: %n");
        for (int i = 0; i < obj1.x; i++) {
            for (int j = 0; j < obj1.y; j++) {
                System.out.printf("%d ", sum[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
