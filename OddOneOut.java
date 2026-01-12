import java.util.*;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if(a == b){
                System.out.println(c);
            }else if(a == c){
                System.out.println(b);
            }else{
                System.out.println(a);
            }
        }
    }
}