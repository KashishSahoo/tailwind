public class a6_toggleIthBit {
    public static void main(String[] args) {
        int n=13;//1101
        int i=2;
        int ans=toggleBit(n,i);//1001 =9
        System.out.println(ans);
    }
    static int toggleBit(int n,int i){
        int ans=n^((1<<i));
        return ans;
    }
}
