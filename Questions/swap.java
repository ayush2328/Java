// public class swap {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int c;
//         System.out.println("Before swapping: ");
//         System.out.println("a = " + a + " b = " + b);
//         c = a;
//         a = b;
//         b = c;
//         System.out.println("After swapping: ");
//         System.out.println("a = " + a + " b = " + b);
//     }

// }
import java.util.Scanner;

// class swap {
//     public static void main(String[] args) {
//         Scanner ob = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = ob.nextInt();
//         if (num > 0) {
//             if (num % 2 == 0) {
//                 System.out.println("The number is even");
//             } else {
//                 System.out.println("the number is odd");
//             }
//         } else {
//             System.out.println("Number is -ve or 0");
//         }

//     }
// }
// class Marks {
//     public static void main(String[] args) {
//         int eng = 10;
//         int maths = 20;
//         int science = 30;
//         int hindi = 40;
//         int sum = eng + maths + science + hindi;
//         System.out.println("sum is:" + sum);
//         int result = (sum * 100) / 500;
//         System.out.println("result is:" + result + "%");

//     }
// }
// class Factorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int fact = 1;
//         while (n != 0) {
//             fact = fact * n;
//             if (n >= 2) {
//                 System.out.print(n + " x ");
//             } else {
//                 System.out.print(n);
//             }

//             n--;
//         }
//         System.out.println(" = " + fact);
//     }
// }
class Square {
    public static void main(String[] args) {
        System.out.println("square of number 1 to 20 is = ");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " = " + i * i);
        }
    }
}