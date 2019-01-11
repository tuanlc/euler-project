class problem5 {
    public static void main(String args[]){
        System.out.println(smallestMultiple());
    }

    private static int smallestMultiple() {
        int result = 2;

        for (int i = 3; i <= 20; i++) {
            result *= i/lagestCommonDivisor(result, i);
        }

        return result;
    }

    private static int lagestCommonDivisor(int a, int b) {
        if (a == b) {
            return a;
        }

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int result = b;

        while(a % b != 0) {
            result = a % b;
            a = b;
            b = result;
        }

        return result;
    }
}
