import java.util.*;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = 0;
        for(int i = 0; i*a <= n; i++){
            for(int j = 0; j*b <= n; j++){
                int r = n - ((i*a)+(j*b));
                if(r >=0 && r % c == 0){
                    int k = r / c;
                    max = Math.max(max, i+j+k);
                }
            }
        }
        System.out.println(max);
    }
}