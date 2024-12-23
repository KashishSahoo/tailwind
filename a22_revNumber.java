public class a22_revNumber {
    public static void main(String[] args) {
        int num=12345;
       int ans= rev(num);
       System.out.println(ans);
    }

    static int rev(int n){
        int reverse=0;
        int num=n;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        return reverse;
    }
}
