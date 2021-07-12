import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = "";
        String str1 = scanner.next();
        String str2 = scanner.next();
        newStr = str.replaceAll(str1,str2);
        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);

    }
}
