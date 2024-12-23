import java.util.Arrays;

public class a1_onePlus{
    public static void main(String[] args) {
        int arr[]={9,9,9};
        int ans[]=plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] plusOne(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        arr=new int[arr.length+1];
        arr[0]=1;
        return arr;
    }
}