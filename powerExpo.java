public class powerExpo {
    public static void main(String[] args) {
        int x=2;
        int n=11;
        int ans=pow(x, n);
        System.out.println(ans);
    }
    public static int pow(int x,int n){
        int ans=1;
        while(n>0){
            //odd power
            if(n%2==1){
                ans=ans*x;
                n=n-1;
            }
            //even power
            else{
                n=n/2;
                x=x*x;
            }
        }
        return ans;
    }
}
