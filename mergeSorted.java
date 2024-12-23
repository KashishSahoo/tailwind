import java.util.Arrays;

public class mergeSorted {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,6,8,9};
        int n=arr1.length;
        int m=arr2.length;
        merge(arr1,arr2,n,m);
    }
    public static void merge(int arr1[],int arr2[],int n,int m){
        int arr3[] =new int[n+m];
        int left=0;
        int right=0;
        int idx=0;
        while(left<n && right<m){
            if(arr1[left]<=arr2[right]){
              arr3[idx]=arr1[left];
              idx++;
              left++;
            }
            else{
                arr3[idx]=arr2[right];
                idx++;
                right++;
            }
        }
        while(left<n){
            arr3[idx]=arr1[left];
            idx++;
            left++;  
        }
        while(right<m){
            arr3[idx]=arr2[right];
            idx++;
            right++;
        }
       for(int i=0;i<n+m;i++){
        if(i<n){
            arr1[i]=arr3[i];
        }
        else{
            arr2[i]=arr3[i];
        }
       }
    }
    public static void merge1(int arr1[],int arr2[],int n,int m){
         int left =n-1;
         int right=0;
         while (left>=0 && right<m) {
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
    }


}
