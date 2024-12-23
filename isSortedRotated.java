public class isSortedRotated {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        boolean ans=check(arr);
        System.out.println(ans);
    }
    public static boolean check(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
            if(arr[n-1]>arr[0]){
                count++;
            }

        }
        return count<=1;


    }
}
