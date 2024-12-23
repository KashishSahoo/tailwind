public class a50_flipToConvert {
    public static void main(String[] args) {
        int s=10;//1010
        int g=7;//0111
        int ans=flip(s,g);
        System.out.println(ans);
    }
    static int flip(int s,int g){
        int ans=s^g;
        int cnt=countSet(ans);
        return cnt;
    }
    static int countSet(int n){
        int cnt=0;
        while(n!=0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}
