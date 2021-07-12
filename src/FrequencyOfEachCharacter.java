import java.util.Scanner;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int l = str.length();
        int [] frequency = new int[l];
        char [] ch = str.toCharArray();
        for(int i = 0; i < l; i++ ){
            frequency[i] = 1;
            for(int j = i+1; j < l; j++){
                if(ch[i] == ch[j]){
                    frequency[i]++;
                    ch[j] ='0';
                }
            }
        }
        for(int i = 0; i < frequency.length; i++ ) {
            if (ch[i] != '0') {
                System.out.println(ch[i] + "-" + frequency[i]);
            }
        }
    }
}
