import java.util.*;

public class SumOfRoundNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t != 0){
            int n =input.nextInt();
            ArrayList<Integer> terms = new ArrayList<>();
            int place = 1;
            while (n != 0) {
                int digit = n % 10;
                if(digit != 0){
                    terms.add(digit*place);
                }
                n /= 10;
                place *= 10;
            }

            System.out.println(terms.size());
            for(int x : terms){
                System.out.print(x +" ");
            }
            System.out.println();
            t--;
        }
    }
}