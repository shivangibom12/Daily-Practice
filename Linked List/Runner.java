
class Node
{
	int data;
	Node next;
}
class LinkedList
{
	Node head;

	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;

		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
				n.next = node;
		}
	}

	public void show()
	{
		Node node = head;
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
			System.out.println(node.data);
	}
}
class Runner
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(9);
		list.insert(8);

		list.show();
	}
}