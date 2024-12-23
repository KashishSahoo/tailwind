public class Largest {
    public static void main(String[] args) {
         //with duplicate elements
        //unsorted array
        int arr[]={1,2,4,7,8,5,7,4,3};
        int Largest=Larg(arr);
        System.out.println("Largset Element:"+Largest);//output:8
    }
    public static int Larg(int arr[]){
       int maxi=0;
       int n=arr.length;
       for(int i=0;i<n;i++){
        //updating maxi
        //if current arr[i] is greater than maxi update
        //finally maxi will have largest elements
        if(arr[i]>=maxi){
            maxi=arr[i];
        }
       }
       return maxi;

    }
}
