import java.util.Scanner;

public class RemoveCHaracterFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.replaceAll("ac", "");
        String str3 = str.replaceAll("b","");
        System.out.println(str3);
    }
}
