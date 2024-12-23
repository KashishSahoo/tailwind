public class a37_plusOne {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2 };
        int n = arr.length;

        int[] ans = plusOne(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        // n=787 788;
        // n=789 790
        // n=899 900;
        // n=999 1000;
    }

    static int[] plusOne(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;
                return arr;
            }
            arr[i] = 0;
        }
        arr = new int[n + 1];
        arr[0] = 1;
        return arr;

    }

}
