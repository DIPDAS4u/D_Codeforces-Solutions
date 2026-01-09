import java.util.*;

public class AplusBAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t != 0){
            int n = input.nextInt();
            int sum = (n/10)+(n%10);
            System.out.println(sum);
            t--;
        }
    }
}