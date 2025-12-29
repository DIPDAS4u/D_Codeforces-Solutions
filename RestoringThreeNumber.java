import java.util.*;

public class RestoringThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[4];
        for(int i = 0; i < 4; i++){
            x[i] = input.nextInt();
        }
        Arrays.sort(x);
        int a = x[3] - x[0];
        int b = x[3] - x[1];
        int c = x[3] - x[2];
        System.out.println(a + " " + b +" "+ c);
    }
}
