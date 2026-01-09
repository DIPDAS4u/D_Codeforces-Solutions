import java.util.*;

public class XeniaandRingroad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[m];
        for(int i = 0 ; i < m; i++){
            a[i] = input.nextInt();
        }
        long distance = 0;
        long X = 1;
        for(int i =0; i < m; i++){
            if(a[i] > X){
                distance += (a[i] - X);
                X = a[i];
            }else if(a[i] < X){
                distance += ((n- X)+a[i]);
                X = a[i];
            }
        }
        System.out.println(distance);
    }
}