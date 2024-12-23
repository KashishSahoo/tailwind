public class a7_removeLastSetBit {
        public static void main(String[] args) {
            int n=12;//1100
            int ans=removeLastSetBitt(n);//1000 =8
            System.out.println(ans);
        }
        static int removeLastSetBitt(int n){
            int ans=n&(n-1);
            return ans;
        }
    }
    
