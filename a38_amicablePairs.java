import java.util.*;
//Google
// You are given two integers ‘X’ and ‘Y’. Your task is to find if the given integers are an amicable pair.

// A pair of numbers are called Amicable if the sum of the proper divisor of each number is equal to the other number. Print ‘True’ if the numbers form amicable pair otherwise print ‘False’

// A positive proper divisor is a positive divisor of a number, excluding itself. For example, 1, 2, and 3 are positive proper divisors of 6, but 6 itself is not.

// For example:

// Let 'X' = 220 and 'Y' = 284 form an amicable pair as the sum of the proper divisor of one is equal to the other. 

// 2
// 4 8
// 220 284
// Sample Output 1:
// False
// True
// Explanation For Sample Input 1:
// In test case 1:
// Proper divisors of 4 are 1 and 2 with sum 3!=8. 
// Proper divisors of 8 are 1, 2, and 4 with sum 7!=4
// Thus they are not amicable pairs.

// In test case 2:
// Proper divisors of X=220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110.
// The sum of these is 284 = Y.

// Proper divisors of Y=284 are 1, 2, 4, 71, and 142.
// The sum of these is 220 = X.

// Thus they are amicable pairs.
// Sample Input 2:
// 3
// 67095 71145
// 253 487
// 280 81
// Sample Output 2:
// True
// False
// False

public class  a38_amicablePairs {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                boolean ans=amicablePair(n1, n2);
                System.out.println(ans);
            
        }
    }
    public static boolean amicablePair(int x, int y){
        ArrayList<Integer> div1=new ArrayList<>();
        ArrayList<Integer> div2=new ArrayList<>();

        int sq1=(int)Math.sqrt(x);
        int sq2=(int)Math.sqrt(y);

        for(int i=1;i<=sq1;++i){
            if(x%i==0){
                div1.add(i);
                 if(i!=x/i && x/i!=x){
                div1.add(x/i);
            }
            }
           
        }
         for(int i=1;i<=sq2;++i){
            if(y%i==0){
                div2.add(i);
                 if(i!=y/i && y/i!=y){
                div2.add(y/i);
            }
            }
           
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<div1.size();i++){
            sum1+=div1.get(i);
        }
          for(int i=0;i<div2.size();i++){
            sum2+=div2.get(i);
        }

        if(sum1==y && sum2==x){
            return true;
        }
        else{
            return false;
        }

    }
}