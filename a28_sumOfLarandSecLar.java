import java.util.*;

public class a28_sumOfLarandSecLar {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] a = new int[n];

            //May have repeated elements
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            TreeSet<Integer> set = new TreeSet<>();
             for (int i = 0; i < n; i++) {
                set.add(a[i]);
            }
             Integer[] uniqueArray = set.toArray(new Integer[0]);
            int f = uniqueArray[uniqueArray.length - 1];
            int l = uniqueArray[uniqueArray.length - 2];
            int answer = f + l;
            System.out.println(answer); 
    }
}


