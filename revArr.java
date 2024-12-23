import java.util.*;
public class revArr {
    public static void main(String[] args) {
        //in place reversing of array
        int arr[]={10,20,30,40,50};
        reverseArray(arr);
        //output:50,40,30,20,10
        
    }
    public static void reverseArray(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<n/2;i++){
          temp=arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
