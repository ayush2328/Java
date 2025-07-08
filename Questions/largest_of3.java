import java.util.Scanner;

public class largest_of3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.printf("%d is largest.", a);
            } else {
                System.out.printf("%d is largest.", c);
            }
        } else {
            System.out.printf("%d is largest.", b);
        }
        sc.close();
    }
}
