import java.util.*;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        while(n-- > 0){
            String statement = input.next();
            if(statement.charAt(1) == '+'){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}