package linkedlist;
public class SinglyLinkedList<T> {

	private Node head;
	private Node tail;

	private class Node {
		public Node(T e) {
			item = e;
		}
		T item;
		Node next;
		public String toString() {
			return item.toString();
		}
	}

	public SinglyLinkedList() {}

	public SinglyLinkedList(SinglyLinkedList<T> c) {
		if (head == null) {
			head = c.head;
		} else {
			tail.next = c.head;
			tail = c.tail;
		}
	}

	public void add(T e) {
		Node newNode = new Node(e);
		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void	addFirst(T e) {
		Node newNode = new Node(e);
		newNode.next = head;
		head = newNode;
	}
	
	public void	addLast(T e) {
		add(e);
	}
	
	public void addAll(SinglyLinkedList<T> c) {
		if (head == null) {
			head = c.head;
		} else {
			tail.next = c.head;
			tail = c.tail;
		}
	}
	
	public void remove(T e) {
		if(e.equals(head.item)) {
			head = head.next;
			return;
		}
		Node prev = head;
		Node temp = head.next;
		while(temp!=null) {
			if(e.equals(temp.item)) {
				prev.next = temp.next;
				return; 
			}
			prev = temp;
			temp = temp.next;
		}
	}

	public void removeFirst() {
		head = head.next;
	}
	
	public void removeLast() {
		if(head.next == null) {
			head =null;
			return;
		}
		Node prev = head;
		while(prev.next!=null && prev.next!=tail) {
			prev = prev.next;
		}
		prev.next = null;
	}
	
	public void removeAll(T e) {
		
	}
	
	public void clear() {
		
	}
	
	public boolean contains(T e) {
		Node temp = head;
		while(temp!=null) {
			if(e.equals(temp.item)) return true;
			temp = temp.next;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		if(head == null) return "[]";
		StringBuilder res = new StringBuilder();
		res.append("[");
		Node temp = head;
		while (temp != null) {
			if (temp.next != null) res.append(temp + ", ");
			else res.append(temp + "]");
			temp = temp.next;
		}
		return res.toString();
	}
}

