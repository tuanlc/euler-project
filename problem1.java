class problem1{
    public static void main(String args[]){

        System.out.println(sumOfMultiplesOf3Or5());
    }

    private static int sumOfMultiplesOf3Or5() {
        int n = 1;
        int sum = 0;

        while(n < 1000) {
            if (n % 3 == 0 | n % 5 == 0) {
                sum += n;
            }
            n++;
        }
        return sum;
    }
}
