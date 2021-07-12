import java.util.Scanner;

public class StringStartsWithAnotherString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.next();
        boolean check = false;
        if(str1.startsWith(str2)) {
            check =true;
            System.out.println(str1 + " starts with " + str2 +" ? " + check);
        }
        else{
            System.out.println(str1 + " starts with " + str2 +" ? " + check);
        }
    }
}
