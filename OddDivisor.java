import java.util.*;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t != 0){
            long n = input.nextLong();
            while(n % 2 == 0){
                n /= 2;
            }
            if(n > 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}