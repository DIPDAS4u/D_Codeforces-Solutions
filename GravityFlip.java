import java.util.*;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] cubes = new int[n];
        for(int i =0; i< n; i++){
            cubes[i] = input.nextInt();
        }
        for(int i = n-1; i > 0; i--){
            for(int j = i-1; j >= 0; j--){
                if(cubes[i]<cubes[j]){
                    int box = (cubes[j] - cubes[i]);
                    cubes[i] += box;
                    cubes[j] -= box;
                }
            }
        }
        for(int i =0; i< n; i++){
            System.out.print(cubes[i] + " ");
        }
    }
}