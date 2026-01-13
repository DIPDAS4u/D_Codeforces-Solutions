import java.util.*;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int h = input.nextInt();
        int[] a = new int[n];
        int width = 0;
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
            if(a[i] > h){
                width += 2;
            }else{
                width += 1;
            }
        }
        System.out.println(width);
    }
}