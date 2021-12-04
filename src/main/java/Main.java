import generics.ComparableStore;
import sort.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
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

        // sort(uses quick sort)
        int[] sortedArr  = new int[]{10, 2, 3, 4, 5, 100, 234, 48};
        Arrays.sort(sortedArr);

        System.out.println("==========================================");
        for(int num : sortedArr) {
            System.out.println(num);
        }

        System.out.println("==========================================");

        List<Integer> nums = Arrays.asList(10,239, 1,5,212);

        // sorts in asc order
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("==========================================");

        // sorts in desc order
        nums.sort(Collections.reverseOrder());

        System.out.println(nums);

        System.out.println("==========================================");

        Book book1 = new Book("Beck", "new_title", 90);
        Book book2 = new Book("Alan", "my_title", 50);
        Book book = new Book("John", "title", 120);

        List<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book));

        System.out.println(books);

        System.out.println("==========================================");

        Collections.sort(books);

        System.out.println(books);

        BookComparator bookC1 = new BookComparator("Beck", "new_title", 90);
        BookComparator bookC2 = new BookComparator("Alan", "my_title", 50);
        BookComparator bookC = new BookComparator("John", "title", 120);

        List<BookComparator> bookComparators = new ArrayList<>(Arrays.asList(bookC1, bookC2, bookC));

        System.out.println("==========================================");
        System.out.println(bookComparators);

        System.out.println("==========================================");
        // bookComparators.sort((my_book1, my_book2) -> Integer.compare(my_book1.getNumOfPages(), my_book2.getNumOfPages()));
        // bookComparators.sort(Comparator.comparingInt(BookComparator::getNumOfPages).reversed());
        // compare num of pages, if equal compare the author name then reverse the list
        bookComparators.sort(Comparator.comparingInt(BookComparator::getNumOfPages).thenComparing(BookComparator::getAuthorName).reversed());

        System.out.println(bookComparators);

        List<String> uList = new ArrayList<>(Arrays.asList("john", "beth", "alan"));

        // now this list cannot no longer be modified
        uList = Collections.unmodifiableList(uList);

        // synchronized collections method(thread safe)

        // add() and remove() method become synchronized when we use Collections.synchronizedList()
        // intrinsic lock - not that efficient because threads have to wait for each other even when tey want to
        // execute independent methods and operations
        // use concurrent collections instead
        List<Integer> my_nums = Collections.synchronizedList(new ArrayList<>());

        System.out.println("==========================================");

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                my_nums.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                my_nums.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Array Size: " + my_nums.size());

        System.out.println("==========================================");

        // Reflection examples

        // 1st approach to acquire class(can use when you know the class you are looking for)
        Class<Book> b = Book.class;

        // get package name and class name
        System.out.println(b.getName());

        System.out.println("==========================================");

        // 2nd approach to acquire class(can use when you know the class you are looking for)
        Class bookClass = null;

        try {
            // approach used heavily by frameworks,
            // argument is package name and class name
            bookClass = Class.forName("sort.Book");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(bookClass);

        OldBook oldBook = new OldBook("Alan", "my_title", 50);

        checkClass(book);
        checkClass(oldBook);

        System.out.println("==========================================");

        // get the package name of a class using reflection
        System.out.println(Book.class.getPackage());
        System.out.println("==========================================");

        // get the fields of a class using reflection
        // doesn't work on private or protected variables(should be public)
        System.out.println(Arrays.toString(Book.class.getFields()));

        // this gets all fields including private
        System.out.println(Arrays.toString(Book.class.getDeclaredFields()));

        System.out.println("==========================================");

        // get the methods of a class using reflection
        // doesn't work on private or protected methods(should be public)
        System.out.println(Arrays.toString(Book.class.getMethods()));

        // this gets all methods including private
        System.out.println(Arrays.toString(Book.class.getDeclaredMethods()));


        // this is how we can instantiate a class under the hood with the help of reflection
        // we will get the constructor for the book class
        // most popular frameworks do this under the hood(spring, hibernate, junit)
        Constructor<Book> constructor = Book.class.getDeclaredConstructor();

        // instantiate a new instance of a class
        // can access private constructors by setting accessible to true
        // You should use ENUMS for singletons because of the fact private class constructors can be used to accessed using reflections
        constructor.setAccessible(true);
        Book reflectBook = constructor.newInstance();

        System.out.println(reflectBook);
        System.out.println(Arrays.toString(Book.class.getInterfaces()));

        System.out.println("==========================================");

        Method[] methods = Book.class.getMethods();

        for(Method m: methods) {
            if(m.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println(m.getName());
            }
        }
    }

    // 3rd approach(can use when you don't know the class you are looking for, uses polymorphism)
    // get class name at run time
    public static void checkClass(BookType book) {
        System.out.println("==========================================");

        Class b =  book.getClass();
       System.out.println(b.getName());
    }
}
