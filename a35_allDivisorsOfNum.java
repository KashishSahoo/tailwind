import java.util.ArrayList;

public class a35_allDivisorsOfNum {
    public static void main(String[] args) {
        int n=36;
        ArrayList<Integer> ans=divisors(n);
        System.out.println(ans);
        
    }

    static ArrayList<Integer> divisors(int n){
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                ans.add(i);
                if(n/i!=i){
                    ans.add(n/i);
                }
            }
        }
        return ans;
    }
}
