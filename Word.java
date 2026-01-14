import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int lowercase = 0;
        int uppercase = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                lowercase++;
            }else{
                uppercase++;
            }
        }
        if(lowercase >= uppercase){
            System.out.println(s.toLowerCase());
        }else{
            System.out.println(s.toUpperCase());
        }
    }
}