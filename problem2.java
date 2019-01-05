class problem2 {
    public static void main(String args[]){

        System.out.println(sumOfEvenFibonacyUnder4Million());
    }

    private static int sumOfEvenFibonacyUnder4Million() {
        int n = 1;
        int m = 2;
        int sum = 0;
        int tmp = 0;

        while(m < 4000000) {
            if (m %2 == 0) {
                sum += m;
            }

            tmp = m;
            m = n + m;
            n = tmp;
        }
        return sum;
    }
}
