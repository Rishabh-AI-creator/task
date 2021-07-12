import java.util.Scanner;

public class UnicodeCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            char a = str.charAt(i);
            if( a >='A' && a <='Z' ){
                continue;
            }
            else if( a >= 'a' && a<= 'z'){
                continue;
            }
            else if(a >= '0' && a <= '9'){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}
