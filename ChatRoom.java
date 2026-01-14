import java.util.*;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String target = "hello";
        int targetIndex = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == target.charAt(targetIndex)){
                targetIndex++;
            }
            if(targetIndex == target.length()){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}