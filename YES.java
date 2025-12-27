import java.util.Scanner;

public class YES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        if(test > 1000){
            System.out.println("Exceeding The limit!");
        }else{
            while(test != 0){
                int satisfy = 0;
                String s = input.next();
                if((s.charAt(0) == 'Y' || s.charAt(0) == 'y') && (s.charAt(1) == 'E' || s.charAt(1) == 'e') && (s.charAt(2) == 'S' || s.charAt(2) == 's')){
                    satisfy = 1;
                }
                if(satisfy == 1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                test--;
            }
        }
    }
}