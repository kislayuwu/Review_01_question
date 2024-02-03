import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputString = sc.nextLine(); // Changed variable name

        System.out.println("Enter word you want to replace: ");
        String old = sc.next();

        System.out.println("Enter word you want to replace with: ");
        String replacementWord = sc.next(); // Changed variable name

        String[] splitInput = inputString.split(" ");

        for (int i = 0; i < splitInput.length; i++) {
            if (splitInput[i].equals(old)) {
                splitInput[i] = replacementWord;
                break;
            }
        }

        // Printing the modified string
        System.out.println(String.join(" ", splitInput));
    }
}
