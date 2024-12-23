public class perfectSq {
     // Function to check if a number is a perfect square using
    // binary search
    public static boolean isPerfectSquare(long n) {
        // Base case: 0 and 1 are perfect squares
        if (n <= 1) {
            return true;
        }

        // Initialize boundaries for binary search
        long left = 1, right = n;

        while (left <= right) {
            // Calculate middle value
            long mid = left + (right - left) / 2;

            // Calculate square of the middle value
            long square = mid * mid;

            // If the square matches n, n is a perfect square
            if (square == n) {
                return true;
            }
            // If the square is smaller than n, search the right
            // half
            else if (square < n) {
                left = mid + 1;
            }
            // If the square is larger than n, search the left
            // half
            else {
                right = mid - 1;
            }
        }

        // If the loop completes without finding a perfect
        // square, n is not a perfect square
        return false;
    }

    public static void main(String[] args) {
        long x = 49;
        if (isPerfectSquare(x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
