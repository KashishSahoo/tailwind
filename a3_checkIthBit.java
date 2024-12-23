public class a3_checkIthBit {
    public static void main(String[] args) {
        int n = 13;// 1101
        int i = 2;
        boolean ans = checkBit(n, i);// 1101 =13
        System.out.println(ans);
    }

    static boolean checkBit(int n, int i) {
        int ans = n &(1 << i);
        if(ans!=0){
            return true;
        }
        return false;
    }
    static boolean checkBit2(int n, int i) {
        int ans = n >>i;
        if((ans&1)==1){
            return true;
        }
        return false;
       
    }

}
