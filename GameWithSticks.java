import java.util.*;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        if((Math.min(n, m))%2 == 0){
            System.out.println("Malvika");
        }else{
            System.out.println("Akshat");
        }
    }
}