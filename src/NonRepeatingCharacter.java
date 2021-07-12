import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for(int i = 0; i < str.length(); i++ )
        if(str.indexOf(i) == str.lastIndexOf(i)){
            System.out.println("The given string is: " + str);
            System.out.println("The first non repeated character in String is: " + str.charAt(i));
            break;
        }
    }
}
