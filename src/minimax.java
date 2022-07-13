import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntToLongFunction;

public class minimax {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Long tempBigSum = 0L;
        Long biggestNumber = Long.valueOf(Collections.max(arr));
        Long lowestNumber = Long.valueOf(Collections.min(arr));
        for (int i = 0 ; i < arr.size(); i ++)
        {
            tempBigSum += arr.get(i);

        }


        System.out.print((tempBigSum - biggestNumber) + " " + (tempBigSum - lowestNumber));
    }
}