public class a5_clearIthBit {
    public static void main(String[] args) {
        int n=13;//1101
        int i=2;
        int ans=clearBit(n,i);//1001 =9
        System.out.println(ans);
    }
    static int clearBit(int n,int i){
        int ans=n&(~(1<<i));
        return ans;
    }
}
