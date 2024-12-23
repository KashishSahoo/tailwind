public class lcmHcf {
    public static void main(String[] args) {
        int a=168;
        int b=288;

        int hcf=HCF(a,b);
        int lcm=LCM(a,b,hcf);

        System.out.println("HCF= "+hcf);
        System.out.println("LCM= "+lcm);

    }
    public static int HCF(int a,int b){
        if(a<b){
            int t=a;
            a=b;
            b=t;
        }
        while (a%b!=0) {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b;
    }

    public static int LCM(int a,int b,int hcf){
        int lcm=(a*b)/hcf;
        return lcm;
    }
}
