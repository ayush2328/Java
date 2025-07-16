import java.util.Scanner;

public class Into {

    /*
     * Arrays Syntax
     * dataType[] array_name = new dataType[size];
     * 
     */
    public static void main(String[] args) {

        // Ques : 01 - Create an array of size 10 containing integer.

        int[] arr = new int[10];

        // indexing & properties
        // Ques : 02 - Create an array of length 5 with values 10 20 30 40 50

        // way 1:
        int[] way1 = new int[5];
        way1[0] = 10;
        way1[1] = 20;
        way1[2] = 30;
        way1[3] = 40;
        way1[4] = 50;

        // way 2:
        int[] way2 = { 10, 20, 30, 40, 50 };

        // how to get the size of an array:
        System.out.println(way2.length);
        Scanner sc = new Scanner(System.in);

    }
}
