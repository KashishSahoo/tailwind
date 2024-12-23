public class divisorsTillN {
    public static void main(String[] args) {
       int n=4;
       int ans=divTillN(n);
       System.out.println("Divisors Sum Till N="+ans); 
    }
    public static int divTillN(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(n/i)*i;
        }
        return sum;
    }
}
