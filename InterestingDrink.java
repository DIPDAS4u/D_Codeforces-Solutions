import java.util.*;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] x = new int[n];
        for(int i =0; i< n; i++){
            x[i] = input.nextInt();
        }
        Arrays.sort(x);
        int q = input.nextInt();
        while(q != 0){
            int m = input.nextInt();
            int count = Drink(x, m);
            System.out.println(count);
            q--;
        }
    }
    static int Drink(int[] x, int m){
        int low = 0;
        int high = x.length;
        while(low < high){
            int mid = (low + high)/2;
            if(x[mid] <= m){
                low = mid +1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}