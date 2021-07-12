import java.util.Locale;
import java.util.Scanner;

public class ConvertFirstCharacterToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char [] str1 = str.toCharArray();
         for(int i = 0; i < str1.length; i++){
             if((i == 0 &&  str1[i] != ' ' )||(str1[i-1] == ' ' && str1[i] != ' ')){
                 if(str1[i] >='a' && str1[i] <='z'){
                     str1[i] = (char) (str1[i] -'a'+'A');
                 }
             }
         }
         String newStr = new String(str1);
        System.out.println("Original String: " + str);
        System.out.println("New String: " + newStr);
    }
}
