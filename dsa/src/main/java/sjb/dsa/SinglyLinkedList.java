package sjb.dsa;

public class SinglyLinkedList {
	Node head;
//	ENDING POSITION
	public void insert(int data) {
		Node newNode=new Node(data);
		
	
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while (temp.next !=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			}
		}
	public void display() {
		Node current=head;
		
		while(current !=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println("null");
		}
public static void main1(String [] args) {
	SinglyLinkedList list=new SinglyLinkedList();
	list.insert(10);
	list.insert(20);
	list.insert(30);
	list.addatposition(90, 2);
	list.display();
}

//BEGINNING POSITION
	public void insert1(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
}
	public void display1() {
		Node current=head;
		
		while(current !=null) {
			System.out.println(current.data);
			current=current.next;
	}
	System.out.println("null");	
	}
		public static void main(String [] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.addatposition(90, 2);
        list.display();
		}
//at specific position
public void addatposition(int data,int pos)
{
	Node newNode=new Node(data);
	Node temp=head;
	for(int i=0;i<pos-1 && temp.next!=null;i++) {
		temp=temp.next;
		
	}
	newNode.next=temp.next;
	temp.next=newNode;
	}
}