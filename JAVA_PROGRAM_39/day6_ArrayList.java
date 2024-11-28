import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class day6_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(21);
        list.add(34);
        list.add(56);
        list.add(67);
        list.add(34);
        list.add(56); 
        System.out.println(list);


        int element = list.get(0);
        System.out.println(element);

        list.add(1,23);
        System.out.println(list);

        list.set(2, 90);
        System.out.println(list);


        list.remove(2);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}
