import java.util.Scanner;

public class CheckStringContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str2 = scanner.nextLine();
        String str1 = scanner.next();
        int l1 = str1.length();
        int l2 = str2.length();
        boolean check = false;

        if(str2.endsWith(str1)){
            check = true;
            System.out.println(str2 + " ends with " + str1 + " ? " + check);
        }
        else{
            System.out.println(str2 + " ends with " + str1 + " ? " + check);
        }

    }
}
