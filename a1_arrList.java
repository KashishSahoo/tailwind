import java.util.ArrayList;
import java.util.Collections;

public class a1_arrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        //add elements
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        // System.out.println(arr);

        //get elements
        // int el=arr.get(1);
        // System.out.println(el);//12

        //add in between

        arr.add(1, 108);
        System.out.println(arr);

        //set elements
        arr.set(0, 16100);
        System.out.println(arr);

        //delete element
        arr.remove(4);
        System.out.println(arr);

        //size 
        int size=arr.size();
        System.out.println(size);

        //iteration
        for(int i=0;i<size;i++){
            System.out.print(arr.get(i)+" ");
        }

        //sorting
        Collections.sort(arr);
        System.out.println(arr);


    }
}