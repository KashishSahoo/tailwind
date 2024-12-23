public class a44_ithBit {
    public static void main(String[] args) {
        int n=13;//1101
        int i=2;
        boolean ans=ithBit2(n,i);
        System.out.println(ans);
    
    }
    static boolean ithBit(int n,int i){
        //left shift opearator
        if((n&(1<<i))!=0){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean ithBit2(int n,int i){
       //right shift opearator
        if(((n>>i)&1)==1){
            return true;
        }
        else{
            return false;
        }
    }

}
