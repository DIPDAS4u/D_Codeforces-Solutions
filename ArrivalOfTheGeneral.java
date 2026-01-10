import java.util.*;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = input.nextInt();
        }
        int max_index = 0;
        int min_index = 0;
        for(int i =0; i<n; i++){
            if(a[i] > a[max_index]){
                max_index = i;
            }
            if(a[i] <= a[min_index]){
                min_index = i;
            }
        }
        int total_moves = max_index + (n - 1- min_index);
        if(max_index>min_index){
            total_moves--;
        }
        System.out.println(total_moves);
    }
}