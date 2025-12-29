import java.util.*;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] cards = new int[n];
        for(int i =0; i < n; i++){
            cards[i] = input.nextInt();
        }
        int S = 0, D = 0;
        int l = 0, r = n-1;
        Boolean Sereja = true;
        while(l <= r){
            int p = 0;
            if(cards[l]>cards[r]){
                p += cards[l];
                l++;
            }else{
                p += cards[r];
                r--;
            }
            if(Sereja == true){
                S += p;
            }else{
                D += p;
            }
            Sereja = !Sereja;
        }
        System.out.println(S+ " " + D);
    }
}
