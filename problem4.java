class problem4 {
    public static void main(String args[]){

        System.out.println(palindrome());
    }

    private static int palindrome() {
        int init = 999;
        int result = 0;
        boolean found = false;

        // Find the lagest number which have 3 digits and is multiples of 11
        while (init > 100) {
            if (init % 11 == 0) {
                break;
            } else {
                init--;
            }
        }

        while (init > 100) {
            for (int i = 999; i > 100; i--) {
                int check = init * i;
                if (isPalindrome(check)) {
                    if (check > result) {
                        result = check;
                    }
                    break;
                }
            }

            init -= 11;
        }

        return result;
    }

    private static boolean isPalindrome(int input) {
        String str = String.valueOf(input);
        String revertStr = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            revertStr += str.charAt(i);
        }

        return str.equals(revertStr);
    }
}
