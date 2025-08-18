import java.util.Scanner;
public class CountFactor {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int count = 0;
    for(int i = 1; i <= num ; i++){
        if(num % i == 0){
            count++;
        }
    }
    System.err.printf("Factor of %d and count is %d",num,count);
    System.err.println();
    sc.close();
    }    
}
