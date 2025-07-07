import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your salary: ");
        int salary = sc.nextInt();
        if (salary > 10000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.print("Your Updated Salary is : ");
        System.out.println(salary);

    }
}
