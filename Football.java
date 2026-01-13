import java.util.*;

public class Football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String positions = input.next();
        int playersO = 0, playersZ = 0;
        for(int i =0; i < positions.length(); i++){
            if(positions.charAt(i) == '1'){
                playersO++;
                if(playersO == 7){
                    break;
                }
                playersZ = 0;
            }else{
                playersZ++;
                if(playersZ == 7){
                    break;
                }
                playersO = 0;
            }
        }
        if(playersO >= 7 || playersZ >= 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}