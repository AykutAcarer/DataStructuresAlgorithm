package DataStructures;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		
//		list.push("A");
//		list.push("B");
//		list.push("C");
//		list.push("D");
//		list.push("F");
		
//		System.out.println(list); 	//[F, D, C, B, A]
//		
//		list.pop();
//		
//		System.out.println(list);	//[D, C, B, A]
		
		list.offer("A");
		list.offer("B");
		list.offer("C");
		list.offer("D");
		list.offer("F");
		System.out.println(list); 	//[A, B, C, D, F]
		
		list.add(4, "E");
		System.out.println(list); 	//[A, B, C, D, E, F]
		
		list.remove("E");	
		System.out.println(list);	//[A, B, C, D, F]
		
		System.out.println(list.peekFirst()); 	//A
		System.out.println(list.peekLast());	//F
		
		list.addFirst("0");
		list.addLast("G");
		System.out.println(list); 	//[0, A, B, C, D, F, G]
		
	}

}
