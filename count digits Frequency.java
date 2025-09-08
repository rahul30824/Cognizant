class Main {
    public static void Solution(int num) {
        int[] freq = new int[10]; // only 0–9

        // Count digits
        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        // Print results
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        int num = 123451232;
        Solution(num);
    }
}
