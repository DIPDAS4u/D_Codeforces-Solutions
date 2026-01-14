import java.util.*;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        while(k-- > 0){
            if(n % 10 == 0){
                n /= 10;
            }else{
                n--;
            }
        }
        System.out.println(n);
    }
}