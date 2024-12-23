import java.util.*;
public class allDivisors {
    public static void main(String[] args) {
        int n=36;
        ArrayList<Integer> list=divisors(n);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    static ArrayList<Integer> divisors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i){
                    list.add(n/i);
                }
            }
        }
        return list;
    }
}
