import java.util.Scanner;

public class RemoveAllZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int l = str.length();
        if(str.charAt(0) == 'z' && str.charAt(l-1) == 'z'){
           String subStr = str.substring(1,l-2).replaceAll("z","");
            System.out.println("The given string is: " + str);
            System.out.println("The new string is: "+"z"+subStr+"z");
        }
        else if(str.charAt(0) == 'z'){
            String subStr = str.substring(1,l-1).replaceAll("z","");
            System.out.println("The given string is: " + str);
            System.out.println("The new string is: "  +"z"+subStr);
        }
        else if(str.charAt(l-1) == 'z') {
            String subStr = str.substring(0, l - 2).replaceAll("z", "");
            System.out.println("The given string is: " + str);
            System.out.println("The new string is: " + subStr + "z");
        }
        else{
            System.out.println("The given string is: " + str);
            System.out.println("The new string is: " + str.replaceAll("z",""));
        }
    }
}
