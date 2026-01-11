import java.util.*;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t != 0) {
            int A = input.nextInt();
            int B = input.nextInt();
            int a = Math.min(A, B);
            int b = Math.max(A, B);
            int difference = b - a;
            int moves = difference / 10;
            if(difference % 10 != 0){
                moves++;
            }
            System.out.println(moves);
            t--;
        }
    }
}