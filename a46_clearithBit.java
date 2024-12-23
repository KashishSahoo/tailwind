
public class  a46_clearithBit {
    public static void main(String[] args) {
        int n=13;//1101
        int i=2;
        int ans=clearithBit(n,i);//1001=9
        System.out.println(ans);
    
    }
    static int clearithBit(int n,int i){
        int ans=(n&(~(1<<i)));
        return ans;
    }
}
