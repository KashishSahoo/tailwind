import java.util.ArrayList;
import java.util.Collections;

public class leadersInArray {
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        //Leaders={22,12,6}
        int n=arr.length;
        ArrayList<Integer> ans = Leaders(arr,n);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static ArrayList<Integer> Leaders(int arr[],int n){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.sort(ans,Collections.reverseOrder());
        return ans;
    }
}
