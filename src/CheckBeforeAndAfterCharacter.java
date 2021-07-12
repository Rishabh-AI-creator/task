import java.util.Scanner;

public class CheckBeforeAndAfterCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = '#';
            int posi = str.indexOf(c);
            boolean verify = false;
            if (str.charAt(posi - 1) == str.charAt(posi + 1)) {
                verify = true;
                System.out.println("The given string is: " + str);
                System.out.println("The before and after character are same: " + verify);
            } else {
                System.out.println("The given string is: " + str);
                System.out.println("The before and after character are same: " + verify);
        }
    }
}
