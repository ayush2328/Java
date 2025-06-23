import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while (i < x) {
            System.out.printf("%d While Loop%n", i);
            i++;
        }
    }
}
