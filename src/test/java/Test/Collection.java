package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;




public class Collection {
public static void main(String[] args) {
//	ArrayList al =new ArrayList();
//	al.add("Velocity");
//	al.add(6);
//	al.add('c');
//	al.add("Mahendrasing Rajput");
//	
//	for(int i=0;i<al.size();i++) {
//		System.out.println(al.get(i));
//	}
//	LinkedList li = new LinkedList();
//    li.add("Velocity");
//    li.add(7);
//    li.add(null);
//    li.add(null);
//    li.add(null);
//    for(int i=0;i<li.size();i++) {
//    	System.out.println(li.get(i));
//    }
//    Vector v =new Vector();
//    v.add("Velocity");
//    v.add(null);
//    v.add(null);
//    v.add(9);
//    v.add("Mahendrasing");
//    for(int i=0;i<v.size();i++) {
//    	System.out.println(v.get(i));
//    }
//    PriorityQueue<String> pq = new PriorityQueue<String>();
//    pq.add("Velocity");
//    pq.add("Katraj");
//    pq.add("Mahi");
    //pq.add(null); null value not allow this method because when null value used then execution stop and then throw exception 
   // pq.add(null);
    //peak method is used to get the peak data
    //poll method is used to get poll data
//    System.out.println(pq);
//    
//    HashSet hs = new HashSet();
//    hs.add("Velocity");
//    hs.add(4);
//    hs.add(4);
//    hs.add(null);
//    hs.add(null);
//    
//    Iterator it = hs.iterator();
//    while (it.hasNext()){
//    	System.out.println(it.next());
//    }
//    HashMap<Integer,String> hm = new HashMap<Integer,String>();
//    hm.put(1, "Velocity");
//    hm.put(2, "Katraj");
//    hm.put(1, "pune");
//    hm.put(null,null);
//    hm.put(4,null);
//    System.out.println(hm.get(2));
//    System.out.println(hm.get(1));
//    System.out.println(hm.get(null));
//    System.out.println(hm.get(4));
//    
    Hashtable<String,Integer> ht =new Hashtable<String,Integer>();
    ht.put("one",9);
    ht.put("two", 7);
   // ht.put(null, null);
    ht.put("three",5);
    
    System.out.println(ht.get("one"));
    System.out.println(ht.get("two"));
   // System.out.println(ht.get(null));
    System.out.println(ht.get("three"));
    
    
    
}
}
