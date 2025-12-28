import java.util.*;

public class Buyashovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int r = input.nextInt();
        for(int i = 1; i < 10; i++){
            int rem = (k*i)% 10;
            if(rem == r || rem == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
