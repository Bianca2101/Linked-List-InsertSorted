public class MyLinkedList<E>
{
	private Node<E> head, tail;
	//Default constructor which creates an empty linkedlist
	public MyLinkedList()
	{
		head = null;
		tail = null;
	}
	//Method for adding an element to the  back of an existing linkedlist
	public void append(E item)
	{
		Node<E> newNode = new Node<>(item);
		
		if(head == null)
		{
			head = tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	//Method for configuring the on screen output
	public String toString()
	{
		String result = "[";
		
		Node<E> ptr = head;
		for(ptr = head; ptr != null; ptr = ptr.next)
		{
			result = result + ptr.element.toString();
			if(ptr.next != null)
				result = result + ",";
		}
		result += "]";
		return result;
	}
	
	//method insertSorted
	public void insertSorted(E item)
	{
		Node<E> pntr = head;
		Node<E> newNode = new Node<>(item);
		if(head == null || ((Comparable)pntr.element).compareTo(item) >= 0)
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			while(pntr.next != null && ((Comparable)pntr.next.element).compareTo(item) < 0)
			{
				pntr = pntr.next;
			}
			newNode.next = pntr.next;
			pntr.next = newNode;
		}
	}
	//The inner class of the LinkedList class
	private static class Node<E>
	{
		E element;
		Node<E> next;
		
		public Node(E element)
		{
			this.element = element;
			next = null;
		}
	}
}