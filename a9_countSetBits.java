public class a9_countSetBits {
    public static void main(String[] args) {
        int n=84;
        int ans=countSetBits(n);
        System.out.println(ans);

    }
    static int countSetBits(int n){
        int cnt=0;
        while (n!=0) {
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}
