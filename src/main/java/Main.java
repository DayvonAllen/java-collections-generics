import generics.ComparableStore;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ComparableStore<String> store1 = new ComparableStore<>();
        store1.setStore1("My Store");
        System.out.println(store1.getStore1());

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

        // do not use over Deque<T> var = new ArrayDeque()
        // Stack is slower because it is synchronized.
        Stack<String> stringStack = new Stack<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        // can use ArrayDeque(more common, double ended queue) or LinkedList to implement Queue Interface
        // Queues that are implemented using an ArrayDeque is faster than queues implemented using LinkedList
        Queue<String> stringQueue = new ArrayDeque<>();
        Queue<String> linkedQueue = new LinkedList<>();

        // should use this for stacks, it is fast.
        // is not synchronized, so it is faster than Stack.
        Deque<String> stringDeque = new ArrayDeque<>();

        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
    }
}
