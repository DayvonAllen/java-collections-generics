import generics.ComparableStore;
import generics.Store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Store<String> store = new Store<>();
        store.setItem("My Store");
//        System.out.println(store.getItem());
        ComparableStore<String> store1 = new ComparableStore<>();
        store1.setStore1("My Store");
//        System.out.println(store1.getStore1());
        ComparableStore<String> store2 = new ComparableStore<>();
        store2.setStore2("My Store");
//        System.out.println(store2.getStore2());

        // lower bounded wildcards
        List<? super Integer> l1 = new ArrayList<Integer>();
        List<? super Integer> l2 = new ArrayList<Number>();
        List<? super Integer> l3 = new ArrayList<Object>();

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);

        System.out.println(l2.get(0));

        // upper bounded wildcards
        List<? extends Integer> myUBW = Arrays.asList(1,2,3,4,5);
        List<? extends Integer> myUBW1 = Arrays.asList(10,20,30,40,50);
        List<? extends Integer> myUBW2 = new ArrayList<Integer>();


        for(Integer myInt :  myUBW) {
            System.out.println(myInt);
        }

        for(Integer myInt :  myUBW1) {
            System.out.println(myInt);
        }
    }
}
