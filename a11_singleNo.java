public class a11_singleNo {
    public static void main(String[] args) {
       int arr[]={1,2,4,1,2,3,4};
       int ans=single(arr);
       System.out.println(ans);

    }
    public static int single(int arr[]){
       int xor=0;
       int n=arr.length;
       for(int i=0;i<n;i++){
        xor=xor^arr[i];
       }
       return xor;
    }
}
