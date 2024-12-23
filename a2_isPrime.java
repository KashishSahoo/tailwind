public class a2_isPrime {
    public static void main(String[] args) {
        int n=13;
        boolean ans=prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n){
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
