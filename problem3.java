class problem3 {
    public static void main(String args[]){

        System.out.println(getLagestPrimeFactorFor(600851475143L));
    }

    private static long getLagestPrimeFactorFor(long input) {
        long n = 2;

        while (input != n) {
            if (input % n == 0) {
                input = input / n;
            } else {
                n++;
            }
        }

        return n;
    }
}
