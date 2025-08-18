import java.util.Scanner;

public class CountFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;

        /*
         * Simple Count Factor with highest Time Complexity
         */
        // for(int i = 1; i <= num ; i++){
        // if(num % i == 0){
        // count++;
        // }
        // }

        /*
         * Minimum Time Complexity
         * program with (square root of n) complexity
         * Big Omega(sqrt(n))
         */
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i != num / i) {
                    count += 2;
                } else {
                    count++;
                }
            }
        }

        System.err.printf("Factor of %d and count is %d\n", num, count);

        /*
         * Checking Prime Number using Count of Factor
         */
        if (count == 2) {
            System.err.printf("%d is a prime number", num);
        } else {
            System.err.printf("%d is Not a prime number.", num);
        }
        System.err.println();
        sc.close();
    }
}
