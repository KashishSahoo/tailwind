import java.util.HashMap;
import java.util.Map.Entry;

public class a19_arrEleFreq {
    public static void main(String[] args) {
        int arr[]={10,20,20,10,10,20,5,20};
        int n=arr.length;
        countFreq(arr,n);
    }

    static void countFreq(int arr[],int n){
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
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
