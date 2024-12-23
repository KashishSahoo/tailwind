import java.util.*;
public class onlyUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String=");
        String org =sc.nextLine();
        String up="";
        for(int i=0;i<org.length();i++){
            char ch=org.charAt(i);
            if(Character.isUpperCase(ch)){
                up+=ch;
            }
        }
        System.out.println(up);
        sc.close();

    }
}
