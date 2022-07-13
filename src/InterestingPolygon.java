public class InterestingPolygon

{
    int solution(int n) {

        // 1 + (1 + 2) + (1 + 2 + 2) + (1 + 2 + 2 + 2) // sol taraf
        // (1 + 2 + 2) + (1 + 2) + ( 1) sag taraf

        int leftSide = 1;
        int rightSide = 1;
        for (int i = 1 ; i < n ; i++)
        {
            leftSide = leftSide + (2 * i);
            System.out.println("Left Side : " + leftSide);

        }
        for (int i = n - 2; i >= 0; i--){

            rightSide = rightSide + (2 * i);
            System.out.println("Right Side: " + rightSide);

        }

        return leftSide + rightSide;

    }

}
