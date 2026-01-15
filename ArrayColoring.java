import java.util.*;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = input.nextInt();
            }
            int blue = 0;
            for(int i = 1; i < n; i++){
                blue += a[i];
            }
            if((blue % 2) == (a[0] % 2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}