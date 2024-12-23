import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class a3_hashmap {
    public static void main(String[] args) {
    
        //Creation
        //country (key),population(value)
        HashMap<String,Integer> map=new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);
        map.put("China", 170);
        
       System.out.println(map);

       //Search
       if(map.containsKey("USA")){
        System.out.println("Usa key exists");
       }
       if(!map.containsKey("Canada")){
        System.out.println("Canada key not exists");
       }

    //    Get value
       System.out.println(map.get("China"));
       System.out.println(map.get("Ireland"));

       //Iteration
    //    int arr[]={9,8,7};
    //    for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    //    }
    //    for(int val:arr){
    //     System.out.println(val);
    //    }

       
       for(Map.Entry<String,Integer> el:map.entrySet()){
       System.out.println(el.getKey()+"=>"+el.getValue());
       }

    Set<String> keys=map.keySet();
    for(String key:keys){
        System.out.println(key+" "+map.get(key));
    }

    //Delete
    map.remove("China");
    System.out.println(map);

    }
}
