public class a6_nthFibo {

    public static void main(String[] args) {
        int n=5;
        int ans=fibRec(n);
        System.out.println(ans);
    }

    static int nthFibonacci(int n) {
        int mod = 1000000007;
        //prestoring
        int dp[]=new int[n+5];
        //initializing dp[0] as 0
        dp[0]=0;
        //initializing dp[1] as 1
        dp[1]=1;
        for(int i=2;i<=n;i++){
            //as same as fibonacci formula f(i)=f(i-1)+f(i-2)
            dp[i]=(dp[i-1]+ dp[i-2])%mod;
        }
        //returning nth value
        return dp[n];
    }
    static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    static int fibRec(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    
}
     
