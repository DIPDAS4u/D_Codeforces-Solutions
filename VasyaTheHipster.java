import java.util.*;

public class VasyaTheHipster {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int differ = 0;
        int same = 0;
        differ = Math.min(a, b);
        a -= differ;
        b -= differ;

        same = Math.max(a, b) / 2;

        System.out.println(differ+ " " + same);
    }
}
