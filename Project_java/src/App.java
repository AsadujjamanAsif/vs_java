import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter: ");
        ch = input.next().charAt(0);
        if (ch == 'a') {
            System.out.println("vowel");
        } else if (ch == 'e') {
            System.out.println("voule");
        } else if (ch == 'i') {
            System.out.println("voule");
        }

        else if (ch == 'o') {
            System.out.println("voule");
        }

        else if (ch == 'u') {
            System.out.println("voule");
        } else {
            /// System.out.println("conconent");
        }
    }
}
