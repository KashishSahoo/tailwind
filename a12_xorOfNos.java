public class a12_xorOfNos {
    public static void main(String[] args) {
       int n=4;
       int ans=xorTillN(n);
       System.out.println(ans);
       int a=4;
       int b=7;
       int xor=xorRange(a, b);
       System.out.println(xor);
 
     }
     static int xorTillN(int n){
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        if(n%4==3){
            return 0;
        }
        if(n%4==0){
            return n;
        }
        return -1;
     }
     static int xorRange(int a,int b){
         int totalXor=xorTillN(b);
         int notReqXor=xorTillN(a-1);
         int reqXor=totalXor^notReqXor;
         return reqXor;
     }
}
