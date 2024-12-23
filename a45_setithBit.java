public class a45_setithBit {
    public static void main(String[] args) {
        int n=9;//1001
        int i=2;
        int ans=setithBit(n,i);//1101=13
        System.out.println(ans);
    
    }
    static int setithBit(int n,int i){
        int ans=(n|(1<<i));
        return ans;
    }
}
