import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.printf("Enter the number of Loop: ");
        int x = sc.nextInt();
        do {
            System.out.printf("%d) Do While Loop.%n", i);
            i++;
        } while (i <= x);
    }
}
