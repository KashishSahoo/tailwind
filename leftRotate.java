public class leftRotate {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = 7;
    int d = 2;
    leftRotateArr(arr, n, d);
    System.out.print("After Rotating the k elements to left ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    }
    public static void leftRotateArr(int arr[],int n,int d){
        if(n==0){
            return;
        }
        d=d%n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
    }
    public static void rev(int arr[],int s,int e){
        while (s<=e) {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
