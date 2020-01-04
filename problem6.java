/**
 *
 * Solution
 *
 * A = 1^2 + 2^2 + ... + n^2 = n*(n+1)*(2n+1)/6
 * B = 1 + 2 + 3 + ... + n = n*(n+1)/2
 *
 * => B - A = n * (n + 1) * (3 * n^2 - n -2) / 12
**/

class problem6 {
    public static void main(String args[]){
        System.out.println(SumSquareDifference(100));
    }

    private static int SumSquareDifference(int n) {
      return n * (n + 1) * (3 * n * n -  n - 2) / 12;
    }
}


