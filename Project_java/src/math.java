import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        int sum = 0;
        int m, n;
        System.out.println("Enter any number : ");
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        System.out.println("Enter any number: ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0)
                sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
    }
}
