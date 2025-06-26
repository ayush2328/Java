import java.util.Scanner;

public class for_each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 4, 2, 53, 58, 9 };
        for (int i : a) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        sc.close();
    }
}
