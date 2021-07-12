import java.util.Scanner;

public class SecondMostFrequentCharaxter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int [] arr = new int[str.length()];
        char [] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            arr[i] = 1;
            for(int j = i+1; j < str.length(); j++){
                if(ch[i] == ch[j]){
                    arr[i]++;
                    ch[j] ='0';
                }
            }
         }
        int secondMax = 0;
        int firstMax = 0;
        char c = '\0';
        for(int i = 0; i < arr.length - 1 ; i++ ){
            if(arr[i] >= arr[firstMax]){
                secondMax = firstMax;
                firstMax = i + 1;
            }
        }
        System.out.println(c);
    }
}
