public class a49_countSetBits {
    public static void main(String[] args) {
        int ans=countSetBits3(13);//1101
        System.out.println(ans);
    }
    static int countSetBits(int n){
        int cnt=0;
        while(n>1){
            if(n%2==1){
                cnt++;
            }
            n=n/2;
        }
        if(n==1){
            cnt++;
        }
        return cnt;
    }
    static int countSetBits2(int n){
        int cnt=0;
        while(n>1){
            if((n&1)==1){
                cnt++;
            }
            n=n>>1;
        }
        if(n==1){
            cnt++;
        }
      
        return cnt;
    }
    static int countSetBits3(int n){
        int cnt=0;
        while(n!=0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}
