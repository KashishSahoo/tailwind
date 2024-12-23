public class a4_setIthBit {
    public static void main(String[] args) {
        int n=9;//1001
        int i=2;
        int ans=setBit(n,i);//1101 =13
        System.out.println(ans);
    }
    static int setBit(int n,int i){
        int ans=n|(1<<i);
        return ans;
    }
}
