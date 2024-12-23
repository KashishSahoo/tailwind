
import java.util.ArrayList;

public class a40_countPrimes {

    public static ArrayList<Integer> getSieve(int n) {
        ArrayList<Integer> prime=new ArrayList<>();

        for(int i=0;i<=n;i++){
            prime.add(1);
        }
        // Mark 0 and 1 as not prime
        prime.set(0, 0);
        prime.set(1, 0);

        for(int i=2;i<=n;i++){
            if(prime.get(i)==1){
                for(int j=i*2;j<=n;j=j+i){
                    prime.set(j, 0);
                }
            }
        }
        return prime;
    }

    public static int countPrimes(int l, int r) {
        ArrayList<Integer> prime = getSieve(r);
        // int cnt = 0;
        int cnt=0;
        
  
        for(int i=2;i<prime.size();i++){
            cnt=cnt+prime.get(i);
            prime.set(i,cnt);
        }
        int right = prime.get(r);
        int left = prime.get(l - 1);
        int ans = right - left;
        // System.out.println(prime);
        return ans;
    }

    public static void main(String[] args) {
        int l = 8;
        int r = 20;
        int count = countPrimes(l, r);
        System.out.println(count);
    }

}
