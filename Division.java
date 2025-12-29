import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t != 0){
            int ratings = input.nextInt();
            if(ratings >= -5000 && ratings <= 5000){
                if(ratings <= 1399){
                    System.out.println("Division 4");
                }else if(ratings >= 1400 && ratings <= 1599){
                    System.out.println("Division 3");
                }else if(ratings >= 1600 && ratings <= 1899){
                    System.out.println("Division 2");
                }else if(ratings >= 1900){
                    System.out.println("Division 1");
                }
            }
            t--;
        }
    }
}
