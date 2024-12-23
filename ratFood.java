import java.util.*;
public class ratFood {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int u=sc.nextInt();
        int n=sc.nextInt();

        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=house(r,u,n,arr);
        System.out.println("Mininum number of houses the rat must visit="+result);
        sc.close();
    }
    static int house(int r,int u,int n,int arr[]){
        int reqFood=r*u;
        int count=0;
        int min=0;
        for(int i=0;i<n;i++){
            min=min+arr[i];
            count++;
            if(min>=reqFood){
             return count;
            }
        }
        return -1;

    }
}
