public class AdjacentProduct {

    int solution(int[] inputArray) {
        int adj = 0;
        int biggest = 0;
        //{3, 6, -2, -5, 7, 3}
        for (int i = 0 ; i < inputArray.length-1; i++)
        {
            System.out.println("I = " + inputArray[i]);

                if (inputArray[i] * inputArray[i + 1] > adj)
                    biggest = inputArray[i] * inputArray[i + 1];


        }
        return biggest;

    }

}
