import java.util.List;

public class LonelyIntegerCheck {

    public int lonelyinteger(List<Integer> a) {
        // Write your code here
        boolean isDuplicate;
        int lonelyInt = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            isDuplicate = false;
            for (int j = 0; j < a.size(); j++) {
                if (i != j) {
                    if (a.get(i) == a.get(j)) {
                        isDuplicate = true;
                        break;
                    }

                }
            }
            if (!isDuplicate) lonelyInt = a.get(i);
        }
        return lonelyInt;
    }

}

