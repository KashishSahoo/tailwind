public class consonatsOnly {
    public static void main(String args[]) {
        String up = "AcAeioBuvhhfuup";
        String ans = consonants(up);
        System.out.println(ans);
    }

    static String consonants(String str) {
        int n = str.length();
        String p = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' &&
                    str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I'
                    && str.charAt(i) != 'O' && str.charAt(i) != 'U') {
                p += str.charAt(i);
            }
        }
        return p;

    }
}
