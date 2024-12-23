public class a48_removeLastSetFromRight {
    public static void main(String[] args) {
        int ans=removeLastSetBit(12);
        System.out.println(ans);
    }
    static int removeLastSetBit(int n){
        int ans=(n&n-1);
        return ans;
    }

}
