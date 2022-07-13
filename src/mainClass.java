import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {


    static int solution(int[] a) {
        int goodTupleCount = 0;
        for (int i = 0; i < a.length - 3; i++) {
            if (a[i] == a[i + 1] || a[i] == a[i + 2] || a[i + 1] == a[i + 2])
                goodTupleCount++;
        }
        return goodTupleCount;

    }


    public static void main(String[] args) {
     /*   System.out.println(militaryTime.timeConversion("07:01:00PM"));
        LonelyIntegerCheck li = new LonelyIntegerCheck();
        List<Integer> a = new ArrayList<>(List.of( 1, 2, 3, 4, 3, 2, 1));
        System.out.println("Lonely integer " + li.lonelyinteger(a));
*/
     /*   List<List<Integer>> arr = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> row2 = new ArrayList<>(List.of(4, 5, 6));
        List<Integer> row3 = new ArrayList<>(List.of(7, 8, 9));

        arr.add(0, row1);
        arr.add(1, row2);
        arr.add(2, row3);
        diagonalDifference dd = new diagonalDifference();
        System.out.println("Sum: " + dd.diagonalDifference(arr));
*/
        Scanner kb = new Scanner(System.in);
        zigzagArray zza = new zigzagArray();
        int[] a = {2,3,5,1,4};
            zza.findZigZagSequence(a, 5);
        }

}
