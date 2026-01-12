import java.util.*;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            char c = input.next().charAt(0);
            String CF = "codeforces";
            boolean appears = false;
            for(int i =0; i < CF.length(); i++){
                if(c == CF.charAt(i)){
                    appears = true;
                    break;
                }
            }
            if(appears == false){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}