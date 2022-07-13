import java.util.ArrayList;
import java.util.List;

public class countingSortAlgo {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> freqArray = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            freqArray.add(0);
        }
        for (int i = 0; i < arr.size(); i++){
            freqArray.set(arr.get(i), freqArray.get(arr.get(i)) + 1 ) ;
        }
        return freqArray;
    }
}
