public class a43_toDecimal {
    public static void main(String[] args) {
        String b="1101";
        int ans=decimal(b);
        System.out.println(ans);
    }
    static int decimal(String b){
        int n=b.length();
        int num=0;
        int pow2=1;
        for(int i=n-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                num=num+pow2;
            }
            pow2=pow2*2;
        }
        return num;
    }
}
