public class a17_Swap {
    public static void main(String[] args) {
        int a=11;
        int b=22;
        swap(a, b);
    }
    static void swap(int a,int b){
        System.out.println("Before Swap a="+a+" And b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swap a="+a+ " And b="+b);
    }
    static void swap2(int a,int b){
        System.out.println("Before Swap a="+a+" And b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap a="+a+ " And b="+b);

    }

}

