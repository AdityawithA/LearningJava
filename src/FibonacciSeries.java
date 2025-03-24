 class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Fixed number of terms
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
