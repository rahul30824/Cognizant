class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 5, 7, 3, 5};

        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // avoid printing same duplicate multiple times
                }
            }
        }
    }
}
