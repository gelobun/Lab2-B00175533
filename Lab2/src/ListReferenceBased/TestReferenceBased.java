package ListReferenceBased;

public class TestReferenceBased {

	private static Node Head;

	//private static int index;

	public static void main(String[] args) {
		ListReferenceBased List = new ListReferenceBased();
		ListReferenceBased List2 = new ListReferenceBased();
		
		
		Node head = new Node();
		
		//head = new Node(new Integer(5));
		head = null;
		
		
		for(Node curr = head; curr !=null; curr.getNext()) {
			System.out.println(curr.getItem());
			curr = curr.getNext();
		}
		
		
		
		
	
		Node n = new Node();
		Node n2 = new Node();
		n.setItem(new Integer(5));
		n2.setItem(new Integer(9));
		
		n.setNext(n2);
		
		System.out.println("Num: " + n.getItem());
		System.out.println("Next num: " + n2.getItem());
		
		
		
		
		
		
		
		
		
		
		
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
