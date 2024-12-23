public class a32_isPrime {
    public static void main(String[] args) {
        int n=23;
        boolean ans=prime2(n);
        System.out.println(ans);
    }
    static boolean prime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean prime2(int n){
        int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                c++;
                if(n/i!=i){
                    c++;
                }
            }
            if(c>2){
                return false;
            }
        }
        
            return true;
        
    }
}
