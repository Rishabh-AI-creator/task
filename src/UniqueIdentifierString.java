import java.util.Scanner;

public class UniqueIdentifierString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int uniqueIdentifier = str.hashCode();
        System.out.println("The hash for " + str + " is " + uniqueIdentifier);
    }
}
