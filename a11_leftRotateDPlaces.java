public class a11_leftRotateDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int d= 2;
        Rotate(arr, n, d);
        System.out.print("After Rotating the k elements to right ");
        for (int i = 0; i < n; i++)
          System.out.print(arr[i] + " ");
        System.out.println();
    
    }
    static void Rotate(int arr[],int n,int d){
        d=d%n;
        rev(arr, 0, d-1);
        rev(arr, d, n-1);
        rev(arr, 0, n-1);
    
    }
    static void rev(int arr[],int s,int e){
        while (s<=e) {
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
        
    }
    
