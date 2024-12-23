import java.util.ArrayList;

class a39_primeFactors{
    public static void main(String[] args) {
        int n=780;
        primeFactors(n);
    }
    static void primeFactors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
           list.add(i);
            }
            while(n%i==0){
                n=n/i;
            }
        }
        if(n!=1){
            list.add(n);
        }
        System.out.println(list);
    }
}