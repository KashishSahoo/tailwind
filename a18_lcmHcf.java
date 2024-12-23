public class a18_lcmHcf {
    public static void main(String[] args) {
        int a = 168;
        int b = 288;
        int hcf = findHCFRec(a, b);
        int lcm = findLCM(a, b, hcf);
        System.out.println("The HCF=" + hcf);
        System.out.println("The LCM=" + lcm);
    }

    static int findHCF(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    static int findHCFRec(int a, int b) {
      if(a==0){
        return b;
      }
      else{
        return findHCFRec(b%a,a);
      }
    }


    static int findLCM(int a, int b, int hcf) {
        int ans = ((a * b) / hcf);
        return ans;
    }
}
