class binarySearch{
    public class static void main(Strings[] args){
        int [] arr={2,4,6,8,8,8,11,13};
        int n=8;
        int x=8;
        int idx=lowerBound(arr,n,x);
        System.out.println(idx);
    }
    public static lowerBound(int arr[],int n,int x){
       int first=-1;
       int last=-1;
       for(int i=0;i<n;i++){
        if(arr[i]==x){
            if(first==-1){
                first=i;
            }
            last=i;
        }
    }
    class Solution {
        public int[] searchRange(int[] arr, int x) {
            int n=arr.length;
            int ans[] ={-1,-1};
            int lb=lowerBound(arr,n,x);
            if(lb==n || arr[lb]!=x){
                ans[0]=-1;
                ans[1]=-1;
                return ans;
            }
            ans[0]=lb;
            ans[1]=upperBound(arr,n,x)-1;
            return ans;
        }
         public static int lowerBound(int []arr, int n, int x) {
           int low=0;
           int high=n-1;
           int ans=n;
           while(low<=high){
               int mid=(low+high)/2;
               if(arr[mid]>=x){
                   ans=mid;
                   high=mid-1;
               }
               else{
                   low=mid+1;
               }
           }
           return ans;
        }
         public static int upperBound(int []arr, int n, int x) {
           int low=0;
           int high=n-1;
           int ans=n;
           while(low<=high){
               int mid=(low+high)/2;
               if(arr[mid]>x){
                   ans=mid;
                   high=mid-1;
               }
               else{
                   low=mid+1;
               }
           }
           return ans;
        }
        static int first(int arr[],int n,int x){
            int low=0;
            int high=n-1;
            int first=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==x){
                    first=mid;
                    high=mid-1;
                }
                else if(arr[mid]<k){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return first;
        }
        static int last(int arr[],int n,int x){
            int low=0;
            int high=n-1;
            int last=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==x){
                    first=mid;
                    low=mid+1;
                }
                else if(arr[mid]<k){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return last;
        }
    }

}