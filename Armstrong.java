class Main {
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        
        // Step 1: count the number of digits
        int n = String.valueOf(num).length();

        // Step 2: calculate the sum of digits raised to n
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num)); // true
    }
}
