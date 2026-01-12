import java.util.*;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int[] numbers = new int[3];
            for(int i =0; i < 3; i++){
                numbers[i] = input.nextInt();
            }
            Arrays.sort(numbers);
            System.out.println(numbers[1]);
        }
    }
}