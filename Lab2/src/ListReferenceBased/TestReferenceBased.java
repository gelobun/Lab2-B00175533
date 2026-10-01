package ListReferenceBased;

import java.util.Iterator;

public class TestReferenceBased {


	private static int index;

	public static void main(String[] args) {
		ListReferenceBased List = new ListReferenceBased();
		
		List.add(1, "Mango");
		List.add(2, "Apple");
		List.add(3, "Mango");
		List.add(4, "Dragonfruit");
		
		List.displayList();
		
		System.out.println(List);
		
		
		
		Node curr = null;
		Node prev = null;
		
		while(curr != null) {
			curr = curr.getNext();
			prev.setNext(curr);
			System.out.println(curr);
		}
	
		
		
		/*for(int i = 1; i < index; i++) {
			System.out.println(List.get(1));
		}
		return;*/
		
		
		
		
		
		
		//Node head = new Node();
		
		//head = new Node(new Integer(5));
		//head = null;
		
		
		/*for(Node curr = head; curr !=null; curr.getNext()) {
			System.out.println(curr.getItem());
			curr = curr.getNext();
		}*/
		
		
	
		//Node n = new Node();
		//Node n2 = new Node();
		//n.setItem(new Integer(5));
		//n2.setItem(new Integer(9));
		
		//n.setNext(n2);
		
		//System.out.println("Num: " + n.getItem());
		//System.out.println("Next num: " + n2.getItem());
		
	
		
		/*Node n1 = new Node();
		Node n2 = new Node();
		
		n1.setItem(new Integer(5));
		n2.setItem(new Integer(9));
		
		n1.setNext(n2);
		
		Node n = new Node(new Integer(6));
		Node first = new Node(new Integer(9), n);
		
		Node head = null;
		
		Node Head = new Node(new Integer(5));
		
		
		for(Node curr = head; curr !=null; curr.getNext()) {
			System.out.println(curr.getItem());
		}*/
		
		
		
		
		
		
		
		
		
		
	}
}



//List.displayList();
//List.listLongest();
