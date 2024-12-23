public class a8_powerOfNo {
    public static void main(String[] args) {
        int n=64;
        boolean ans=isPowerOfTwo(n);
        System.out.println(ans);

    }
    public static boolean isPowerOfTwo(int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
}
