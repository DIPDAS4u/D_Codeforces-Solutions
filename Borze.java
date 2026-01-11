import java.util.*;

public class Borze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code = input.next();
        for(int i = 0; i < code.length(); i++){
            if(code.charAt(i) == '.'){
                System.out.print("0");
            }else if(code.charAt(i) == '-' && (i+1) < code.length()){
                if(code.charAt(i+1) == '-'){
                    System.out.print("2");
                }else if(code.charAt(i+1) == '.'){
                    System.out.print("1");
                }
                i++;
            }
        }
    }
}