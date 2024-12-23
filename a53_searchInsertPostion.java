class binarySearch{
    public class static void main(Strings[] args){
        int [] arr={1,2,3,7};
        int n=4;
        int x=6;
        int idx=searchInsertPostion(arr,n,x);
        System.out.println(idx);
    }
    public static searchInsertPostion(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;

        while(low<=high){
            int mid=(low+high)/2;
            //may be an answer
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

}