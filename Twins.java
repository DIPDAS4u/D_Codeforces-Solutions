import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int total = 0;
        for(int i =0; i< n; i++){
            a[i] = input.nextInt();
            total += a[i];
        }
        Arrays.sort(a);
        int sum = 0;
        int coins = 0;
        for(int i = n-1; i >= 0; i--){
            if(sum <= total){
                sum += a[i];
                total -= a[i];
                coins++;
            }else{
                break;
            }
        }
        System.out.println(coins);
    }
}