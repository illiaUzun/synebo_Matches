package sample;

public class Matches {


    /**
     *     Algorithm counts matches in spiral way. If there is number of squares of wich we can get a square root without residue
     *     - we just print the number of matcher in it using (√n * (√n + 1)) * 2;
     *      If there is number of squares of wich we can NOT get a square root without residue
     *     - we count other matches (+3 matches for the first square and +3 matches if the number of remained squares is bigger then √n) && (+2 matches for other squares)
     */
    public int matches(int numSquares) {
        try {
            int nSqrt = (int) Math.sqrt(numSquares);
            int base = (nSqrt * (nSqrt + 1)) * 2;
            int remain = numSquares - nSqrt * nSqrt;

            if (remain != 0) {
                if ((double) remain / nSqrt > 1) {
                    return base + 2 * 3 + ((remain - 2) * 2);
                }
                return base + 3 + ((remain - 1) * 2);
            } else {
                return base;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean validation(int num) {
        if (num < 0) {
            return false;
        }
        return true;
    }
}
