import java.util.*;
import java.util.Map.Entry;
public class a60_singleNo2 {
    public static void main(String[] args) {
        int arr[]={4,4,4,3,3,3,2,2,2,8};
        int answer=singleNumberInThrice(arr,arr.length);
        System.out.println(answer);
    }
    static int singleNumberInThrice(int []arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i], map.get(arr[i])+1);
           }
           else{
            map.put(arr[i], 1);
           }
       }
         for(Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;

    }
}
