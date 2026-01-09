import java.util.*;

public class Marathon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t != 0){
            int front = 0;
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            if(b > a){
                front++;
            }
            if(c > a){
                front++;
            }
            if(d > a){
                front++;
            }
            System.out.println(front);
            t--;
        }
    }
}