public class a13_linearSearch {
    public static void main(String[] args) {
        int arr[]={11,22,3,24,78,54,23,45,2,57};
        int tar=23;
        int idx=linear(arr,tar);
        System.out.println(idx);
    }
    static int linear(int arr[],int tar){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==tar)
            {
                return i;
            }
        }
        return -1;
    }
}
