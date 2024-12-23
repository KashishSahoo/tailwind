public class untilSingle {
    public static void main(String[] args) {
        int n=89123; //8+9+1+2+3=23  23=2+3=5
        int ans=untilOne(n);
        System.out.println(ans);
    }

    public static int untilOne(int n) {
        if(n<=9){
            return n;
        }
        int ans=(n%9==0)?9:(n%9);
        return ans;
    }

}
