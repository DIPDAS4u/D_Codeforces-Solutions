import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char[] digits = s.replaceAll("\\+", "").toCharArray();
        Arrays.sort(digits);
        for(int i =0; i < digits.length; i++){
            if(i != (digits.length-1)){
                System.out.print(digits[i] + "+");
            }else{
                System.out.print(digits[i]);
            }
        }
    }
}