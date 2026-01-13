import java.util.*;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int cost1 = n*a;
        int cost2 = ((n+m-1)/m) * b;
        int cost3 = ((n/m)*b + (n%m)*a);
        int ans = Math.min(cost1, Math.min(cost2, cost3));
        System.out.println(ans);
    }
}