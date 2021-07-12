import java.util.Scanner;

public class CompareStringsLexicographically {
    public static int compareStrings(String str1 ,String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        int lc = 0;
        int a = 0;
        if(l1<=l2){
            lc = l1;
        }
        else{
            lc = l2;
        }
        for(int i = 0; i < lc; i++){
            if(str1.charAt(i) == str2.charAt(i)){
                continue;
            }
            else if(str1.charAt(i) > str2.charAt(i)){
                a = 1;
            }
            else if(str1.charAt(i) < str2.charAt(i)){
                a = -1;
            }
        }
    return a ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int a = compareStrings(str1,str2);
        if(a == 1){
            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            System.out.println(str2 + " is less than " + str1);
        }
        else if(a == -1){
            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            System.out.println(str1 + " is less than " + str2);
        }
        else{
            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            System.out.println(str1 + " is same as " + str2);
        }
    }
}
