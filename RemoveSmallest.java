import java.util.*;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i =0; i < n; i++){
                a[i] = input.nextInt();
            }
            Arrays.sort(a);
            Boolean possible = true;
            for(int i =0; i < n-1; i++){
                if((a[i+1]-a[i])>1){
                    possible = false;
                    break;
                }
            }
            if(!possible){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}