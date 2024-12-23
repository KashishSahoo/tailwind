public class a34_untilSingleDigitSum {
    public static void main(String[] args) {
        int n=35637;//3+5+6+3+7=24   24=>2+4=6
        int ans=sums(n);
        System.out.println(ans);
    }
    static int sums(int n){
        if(n<=9){
            return n;
        }
        int ans=n%9==0?9:n%9;
        return ans;
    }
}