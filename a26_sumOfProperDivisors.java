import java.util.ArrayList;

public class a26_sumOfProperDivisors {
    public static void main(String[] args) {
        int n=10;
        int ans=properSum(n);
        System.out.println(ans);
    }

    static int properSum(int n){
        int sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i && n/i!=n){
                    list.add(n/i);
                }
            }
        }

        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        return sum;
    }
}
