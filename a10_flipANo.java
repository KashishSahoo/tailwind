public class a10_flipANo {
    public static void main(String[] args) {
       int a=7;
       int b=10;
       int ans=bitsToflip(a,b);
       System.out.println(ans);

    }
    static int bitsToflip(int a,int b){
        int xorAns;
        int ans;
        xorAns=a^b;
        ans=countSetBits(xorAns);
        return ans;
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
