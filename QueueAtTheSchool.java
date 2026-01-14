import java.util.*;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        String s = input.next();
        char[] str = s.toCharArray();
        for(int i = 0; i < t; i++){
            for(int j = 0; j < n-1; j++){
                if(str[j] == 'B' && str[j+1] == 'G'){
                    str[j] = 'G';
                    str[j+1] = 'B';
                    j++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(str[i]);
        }
    }
}