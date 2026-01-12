import java.util.*;
     
public class SpyDetected {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i =0; i < n; i++){
                a[i] = input.nextInt();
            }
            int common = 0;
            if(a[0] == a[1] || a[0] == a[2]){
                common = a[0];
            }else{
                common = a[1];
            }
            for(int i =0; i < n; i++){
                if(a[i] != common){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}