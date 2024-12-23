class bits {
    public static void main(String[] args) {
        // System.out.println("Hare Krishna");
        int n = 10;
        int i = 3;
        // char ch='D';
        boolean ans = ithBit(n,i);
        System.out.println(ans);
    } 
     

    static boolean ithBit(int n, int i) {
        if ((n & (1 << i)) != 0) {
            return true;
        }
        return false;
    }

    static int setithBit(int n, int i) {
        int ans = (n | (1 << i));
        return ans;
    }

    static int clearithBit(int n, int i) {
        int ans = (n & ~(1 << i));
        return ans;
    }

    static int toggleithBit(int n, int i) {
        int ans = (n ^ (1 << i));
        return ans;
    }

    static int unsetRightMostSethBit(int n,int i){
         int ans=(n&(n-1));
         return ans;
     }
    static int countSetBits(int n){
        int cnt=0;
        while(n!=0){
            n=(n&(n-1));
            cnt++;
        }
        return cnt;
    }
    static int toBeFiliped(int a,int b){
        int ans=a^b;
        int cnt=0;
        cnt=countSetBits(ans);
        return cnt;
    }
    static boolean toBeFiliped(int n){
          if((n&(n-1))==0){
              return true;
          }
          return false;
    }
    static void parity(int n){
        int cnt=countSetBits(n);
        if(cnt%2==0){
            System.out.println("Even Parity");
        }
        else{
            System.out.println("Odd Parity");
        }
    }
    static int letterPostion(char ch){
        int ans=(ch&31);
        return ans;
    }
    static int singleNo(int arr[]){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
          ans=ans^arr[i];
        }
        return ans;
    }
    static int Missing(int arr[]){
        int xor1=0;
        int xor2=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
          xor2=xor2^arr[i];
          xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return (xor1^xor2);
    }





}    
