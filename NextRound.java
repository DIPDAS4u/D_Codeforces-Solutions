import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] score = new int[n];
        for(int i = 0; i < n; i++){
            score[i] = input.nextInt();
        }
        int advancers = 0;
        for(int i = n-1; i >= 0; i--){
            if(score[k-1] <= score[i] && score[i] !=0){
                advancers++;
            }
        }
        System.out.println(advancers);
    }
}