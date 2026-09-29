package ListReferenceBased;

public class TestReferenceBased {
	
	public static void main(String[] args) {
		ListReferenceBased List = new ListReferenceBased();
		List.add(1, "Mango");
		
		List.displayList();
		
		
		Node head = null;
		for(Node curr = head ; curr!= null; curr = curr.getNext()) {
			System.out.println(curr.getItem());
			
		}
		
	}
}
