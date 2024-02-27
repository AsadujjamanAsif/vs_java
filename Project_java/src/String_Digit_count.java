import java.util.Scanner;

public class String_Digit_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any words: ");
        String str = input.nextLine();
        input.close();
        String[] strar = str.split(" ");
        System.out.println("THe number of word: " + strar.length);
    }
}
