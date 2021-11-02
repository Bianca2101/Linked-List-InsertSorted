public class TestMyLinkedList
{
	public static void main(String[] args)
	{
		
		MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
		//Output an empty list
		System.out.println("\nTest InsertSorted with empty list:\t"+list1);
		//Add elements to the LinkedList using insertSorted
		System.out.println("\nAdding elements...");
		list1.insertSorted(3);
		list1.insertSorted(4);
		list1.insertSorted(6);
		list1.insertSorted(7);
		
		System.out.println("\nList:\t"+list1);
		
		//Add an element at the head of the list
		list1.insertSorted(2);
		System.out.println("\nInsert 2 in the list:\t"+list1);	
		//Add an element at the tail of the list
		
		list1.insertSorted(8);
		System.out.println("\nInsert 8 in the list:\t"+list1);
		
		//Add any other element 
		list1.insertSorted(5);
		//Output the elements in list1 by implicitly calling the toString method
		System.out.println("\nInsert 5 in the list:\t"+list1);
	}
}