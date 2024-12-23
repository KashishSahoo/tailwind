public class a3_isSortedAndRotated {
    static boolean check(int[] arr) {

        int n=arr.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        boolean ans=check(nums);
        System.out.println(ans);
    }
    
}

