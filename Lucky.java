import java.util.*;

public class Lucky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t != 0){
            int ticket = input.nextInt();
            int l_sum = (ticket%10)+((ticket/10)%10)+((ticket/100)%10);
            int r_ticket = ticket/1000;
            int f_sum = (r_ticket%10)+((r_ticket/10)%10)+((r_ticket/100)%10);
            if(f_sum == l_sum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
