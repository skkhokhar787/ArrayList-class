import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {
    public static void main (String [] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get elements
        int ele = list.get(1);
        System.out.println(ele);

        // add ele in between
        list.add(1, 1);

        System.out.println(list);

        // set element
        list.set(0, 5);

        System.out.println(list);

        // remove element

        list.remove(3);
        System.out.println(list);

        // check size of list
        int size = list.size();
        System.out.println(size);

        // using loop
        for (Integer integer : list) {
            System.out.print(integer);
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}