import java.util.Scanner;

public class digit {

    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter any number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digit: " + count);
    }
}