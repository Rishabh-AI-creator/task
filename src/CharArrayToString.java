import java.util.Scanner;

public class CharArrayToString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char [] ch = scanner.nextLine().toCharArray();
        String str = "";
        for(int i = 0; i < ch.length ; i++){
            if(ch[i] == ' '){
                continue;
            }
            else {
                str = str + ch[i];
            }
        }
        System.out.println(str);
    }
}
