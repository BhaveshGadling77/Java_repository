import java.util.*;

public class collection_framework {
    public static void main(String[] args) {
        // ArrayList
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 25);
        list.add(4, 20);
        list.add(5, 77);
        list.add(6, 98.91);
        list.add("Bhavesh");
        System.out.println(list);

        // LinkedList
        // List list = new LinkedList();
        // list.add(0, 10);
        // list.add(20);
        // list.remove(0);
        // list.add(1 , 15);
        // System.out.println(list);

        // Vector
        // Vector <Integer> obj = new Vector();
        // obj.add(10);
        // obj.add(20);
        // obj.add(30);
        // System.out.println(obj);

        // Stack
        // Stack<Integer> stack = new Stack<Integer>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println("Stack : "+stack+ " Peek : "+stack.peek());
        // stack.pop();
        // System.out.println(stack.peek());
        // System.out.println(stack);

        // Sets
        // HashSet
        // Set<Integer> set = new HashSet<Integer>();
        // set.add(10);
        // set.add(15);
        // set.add(16);
        // set.add(2);
        // set.add(10);
        // System.out.println(set);

        // LinkedHashSet
        // LinkedHashSet llset = new LinkedHashSet();
        // llset.add(10);
        // llset.add(20);
        // llset.add(30);
        // llset.add(2);
        // llset.add(2);
        // boolean bl = llset.contains(7);
        // System.out.println(llset);
        // System.out.println(bl);
        // Tree set
        // TreeSet tset = new TreeSet();
        // tset.add(10);
        // tset.add(20);
        // tset.add(2);
        // tset.add(12);
        // tset.add(6);
        // tset.add(10);
        // System.out.println(tset);
        // Queue
        // Queue obj = new LinkedList();
        // obj.add(10);
        // obj.add(40);
        // obj.offer(20);
        // obj.offer(30);
        // System.out.println("Queue =" +obj );
        // System.out.println("Queue remove = "+obj.poll());
        // System.out.println("Queue after remove "+obj);

        // ArrayDeque
        // Deque adq = new ArrayDeque();
        // adq.offer(10);
        // adq.offer(20);
        // adq.offerLast(30);
        // adq.pollFirst();
        // adq.pollLast();
        // adq.offerFirst(40);
        // System.out.println("Deque = "+adq);

        // PRIOIRITYQUEUE
        // PriorityQueue pq = new PriorityQueue(Comparator.reverseOrder());
        // pq.offer(10);
        // pq.add(20);
        // pq.add(2);
        // pq.offer(3);
        // pq.add(5);
        // System.out.println(pq);
        // System.out.println("PriorityQueue = "+ pq.peek());

        // Map
        // -> Hash maps
        // HashMap <String, Integer> map = new HashMap<String, Integer>();
        // map.put("Second",20);
        // map.put("First", 5);
        // map.put("Third ", 4);
        // System.out.println("Map : "+map);

        // -> Tree maps
        // TreeMap <String, Integer> map1 = new TreeMap <String, Integer>();
        // map1.put("2nd" , 20);
        // map1.put("1st", 5);
        // map1.put("4th", 7);
        // map1.put("3rd", 4);
        // System.out.println("Tree Map : "+ map1);System.out.println(map1.get("1st"));
        // System.out.println(map1.keySet());
        // System.out.println(map1.values());

        // ->TreeMap
        // int arr[] = {1,20,3,40,5,6,7,7};
        // System.out.print("Before sorting : ");
        // for(int val : arr)
        // System.out.print(val+",");
        // Arrays.sort(arr);
        // System.out.println();
        // System.out.print("After sorting : ");
        // for(int val : arr)
        // System.out.print(val+",");
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Second");
        myList.add("First");
        myList.add("Third");
        System.out.println(myList);
        System.out.println("Max : " + Collections.max(myList));
        Collections.sort(myList);
        System.out.println(myList);

        System.out.println("Max : " + Collections.max(myList));

        Iterator it = myList.Iterator();
        while (it.next())
            System.out.println(it.next());

    }
}