import java.util.*;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int k = input.nextInt();
            int current = 0;
            int count = 0;
            while(count < k){
                current++;
                if(current % 3 != 0 && current % 10 != 3){
                    count++;
                }
            }
            System.out.println(current);
        }
    }
}