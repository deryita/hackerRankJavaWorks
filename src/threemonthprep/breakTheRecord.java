package threemonthprep;

import java.util.ArrayList;
import java.util.List;

public class breakTheRecord {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> maxMinRecords = new ArrayList<>();
        int min = scores.get(0);
        int max = scores.get(0);
        int mincount = 0;
        int maxcount = 0 ;
        //12, 24, 10, 24 returns 1,1
        for (int i = 0; i < scores.size(); i ++){
            if (scores.get(i) < min && scores.get(i) < scores.get(0)) {mincount ++; min = scores.get(i); }
            if (scores.get(i) > max && scores.get(i) > scores.get(0) ) {maxcount ++;  max = scores.get(i); }
        }

        maxMinRecords.add( maxcount);
        maxMinRecords.add( mincount);
        return maxMinRecords;
    }

}
