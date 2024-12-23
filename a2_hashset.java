import java.util.Iterator;
import java.util.HashSet;
public class a2_hashset {
    public static void main(String[] args) {

        //creation
        HashSet<Integer> set=new HashSet<>();

        //insert
        set.add(11);
        set.add(22);
        set.add(11);
        set.add(22);
        set.add(208);
        set.add(108);
        System.out.println(set);

        //search
        if(set.contains(108)){
            System.out.println("108 exists");
        }
        if(!set.contains(100)){
            System.out.println("100 do not exists");
        }

        //delete
        set.remove(22);
        System.out.println(set);

        // size
        int size=set.size();
        System.out.println(size);

        //iteration

        //in for loop
        // for(int i=0;i<n;i++)

        //in set
        Iterator<Integer> it=set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

       


    }

}
