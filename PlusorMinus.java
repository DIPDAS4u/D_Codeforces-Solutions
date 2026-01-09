import java.util.*;

public class PlusorMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t != 0){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if((a+b) == c){
                System.out.println("+");
            }else if((a-b) == c){
                System.out.println("-");
            }
            t--;
        }
    }
}