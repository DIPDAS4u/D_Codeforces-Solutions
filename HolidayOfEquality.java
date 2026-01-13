import java.util.*;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i =0; i< n; i++){
            a[i] = input.nextInt();
        }
        Arrays.sort(a);
        int total_burles = 0;
        for(int i = n-2; i >= 0; i--){
            if(a[i] != a[n-1]){
                total_burles += a[n-1]-a[i];
            }
        }
        System.out.println(total_burles);
    }
}