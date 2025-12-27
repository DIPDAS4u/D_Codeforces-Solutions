import java.util.Scanner;
import java.math.BigInteger;

public class AgainTwentyFIve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();
        if(n.compareTo(BigInteger.valueOf(1)) <= 0 || n.compareTo(new BigInteger("2000000000000000000")) > 0){
            System.out.println("Exceeding the limit!");
        }else{
            System.out.println("25");
        }
    }
}
