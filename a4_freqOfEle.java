import java.util.*;

public class a4_freqOfEle {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,2,2,3};
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            //map.getOrDefault() used to get value of key and set a default value it do not have
            int val=map.getOrDefault(arr[i], 0);
            map.put(arr[i], val+1);
        }
        for(Map.Entry<Integer,Integer> el:map.entrySet()){
            System.out.println(el.getKey()+"=>"+ el.getValue());
        }

    }
}
