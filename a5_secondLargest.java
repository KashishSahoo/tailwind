import java.util.*;
public class a5_secondLargest {
    public static void main(String[] args) {
        //with duplicate elements
        //unsorted array
        int arr[]={1,2,4,7,8,5,7,4,3};
        int secondLar=secondLarg(arr);
        System.out.println("Second Largset Element:"+secondLar);//output:7
    }
    public static int secondLarg(int arr[]){
        //declaring TreeSet
        TreeSet<Integer> set=new TreeSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            //adding to set
            set.add(arr[i]);
        }
        //converting set to array
        Integer [] ans=set.toArray(new Integer[0]);
        //getting second largest element
        int secondLar=ans[ans.length-2];
        return secondLar;
}
}
