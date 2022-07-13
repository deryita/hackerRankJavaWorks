import java.util.List;

public class diagonalDifference {
    public int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int firstsum = 0;
        int secondsum = 0;
     /*
      //Print all elements
      for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.println(arr.get(i).get(j));
            }
        }*/

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(" First items: " + arr.get(i).get(i));
            firstsum += arr.get(i).get(i);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(" Second items: " + arr.get(i).get(arr.size() -1  - i));
            secondsum += arr.get(i).get(arr.size() -1  - i);
        }

        System.out.println("FirstSum: " + firstsum);
        System.out.println("SecondSum: " + secondsum);

        return Math.abs(firstsum - secondsum);

    }
}
