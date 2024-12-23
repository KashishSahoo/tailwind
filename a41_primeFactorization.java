import java.util.*;

class a41_primeFactorization{
    public static void main(String[] args) {
        int n=45;
        ArrayList<Integer> ans=spf(n);
        System.out.println(ans);
    }
    static   ArrayList<Integer> spf(int n){
        ArrayList<Integer> ans=new ArrayList<>();

        int spf[]=new int[n+1];

        for(int i=0;i<spf.length;i++){
            spf[i]=i;
        }


        for(int i=2;i*i<=n;i++){
            if(spf[i]==i){
                for(int j=i*2;j<=n;i++){
                    if(spf[j]==j){
                        spf[j]=i;
                    }
                }
            }
        }
        // for(int i=0;i<=n;i++){
        //     System.out.print(spf[i]+" ");
        // }

        while(n!=1){
            ans.add(spf[n]);
            n=n/spf[n];
        }
        return ans;
    }
}