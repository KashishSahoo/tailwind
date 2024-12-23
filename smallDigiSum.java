import java.util.*;
public class smallDigiSum {
 public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n :");
    n=sc.nextInt();
     System.out.println("Enter n elements");
    int arr[]=new int [n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=miniDigit(arr[i]);
    }
    System.out.println("The sum of smallest digit from each element in array:");
    System.out.println(sum);
    sc.close();
 }
 public static int miniDigit(int n){
    int mini=Integer.MAX_VALUE;
    while(n!=0){
        int lastDigit=n%10;
        mini=Math.min(mini,lastDigit);
        n=n/10;
    }
    return mini;
 }

    
}