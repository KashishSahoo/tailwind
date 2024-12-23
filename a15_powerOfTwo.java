public class a15_powerOfTwo {
    public static void main(String[] args) {
        int n=32;
        boolean ans=power2(n);
        System.out.println(ans);
    }
    static boolean power2(int n){
        int count=0;
        while(n!=0){
            int bit=n&1;
            n=n>>1;
            if(bit==1){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean pow2(int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
}
