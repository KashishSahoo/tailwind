public class a10_sumOfAlldivfromOneToN {
    public static void main(String[] args) {
        // n=4;
        // f(1)=1;
        // f(2)=1+2=3;
        // f(3)=1+3=4;
        // f(4)=1+2+4=7;
        // ans=f(1)+f(2)+f(3)+f(4)=1+3+4+7=15;

        int n=4;
        int ans=div(n);
        System.out.println(ans);
    }
    static int div(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(n/i)*i;
        }
        return sum;
    }
}
