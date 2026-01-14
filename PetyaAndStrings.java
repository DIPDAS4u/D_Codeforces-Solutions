import java.util.*;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next().toLowerCase();
        String s2 = input.next().toLowerCase();
        int equivalent = 0;
        for(int i =0; i < s1.length(); i++){
            if(s1.charAt(i) < s2.charAt(i)){
                equivalent = -1;
                break;
            }else if(s1.charAt(i) > s2.charAt(i)){
                equivalent = 1;
                break;
            }
        }
        System.out.println(equivalent);
    }
}