import java.util.*;
import java.io.*;
class DQUEUESLL
{
	public static void main(String args[])
	{
		DQUEUESLLOPERATIONS l = new DQUEUESLLOPERATIONS();
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("enter your choice \n 1.insert at front\n 2.insert at end \n 3.delete at front \n 4.delete at end \n 5.display\n 6.exit");
			switch(sc.nextInt())
			{
				case 1: System.out.println("enter element to insert");
					l.insertfront(sc.nextInt());
					break;
				case 2 : System.out.println("enter element to insert");
					l.insertend(sc.nextInt());
					 break;
				case 3 : l.deletefront();
					 break;
				case 4 : l.deleteend();
					 break;
				case 5 : l.display();
					 break;
				case 6 : loop = false;
					 break;
				default : System.out.println("invalid choice");
					 break;
			}
		}
	}
}

class node
{
	int data;
	node next;
}

abstract class DQUEUESLLSPECIFICATIONS
{
	abstract public node create(int element);
	abstract public void insertfront(int element);
	abstract public void insertend(int element);
	abstract public void deletefront();
	abstract public void deleteend();
	abstract public void display();
	node head;
}

class DQUEUESLLOPERATIONS extends DQUEUESLLSPECIFICATIONS
{
	int front = -1;
	int rear = -1;
	public node create(int element)
	{
		node s = new node();
		s.data = element;
		s.next = null;
		return s;
	}
	public void insertfront(int element)
	{
		if(head==null)
		{
			System.out.println("creating head");
			head = create(element);
			front++;
			rear++;
		}
		else
		{
			node t =create(element);
			t.next = head;
			head = t;
			
		}
	}
	public void insertend(int element)
	{
		if(head==null)
		{
			System.out.println("creating head");
			head = create(element);
			front++;
			rear++;
		}
		else
		{
			node t = head;
			while(t.next!=null)
			{
				t = t.next;
			}
			t.next = create(element);
			rear++;
			
		}
	}
	public void deletefront()
	{
		if(head==null)
			System.out.println("no elements in list");
		else
		{
				System.out.println("deleted element is :"+head.data);
				head = head.next;
				front=-1;
				rear =-1;
		}
		
	}
	public void deleteend()
	{
		if(head==null)
			System.out.println("no elements in list");
		else if(head.next==null)
		{
				System.out.println("deleted element is :"+head.data);
				head = head.next;
				front=-1;
				rear =-1;
		}
		else
		{
			node t = head;
			node prev = null;
			while(t.next!=null)
			{
				prev = t;
				t= t.next;
				
			
			}
			prev.next = null;
			System.out.println("deleted element is :"+t.data);
			
		}
	}
	public void display()
	{
		
		node temp = head;
		while(temp!=null)
		{
			System.out.println("-----> "+temp.data);
			temp = temp.next;
		}
	}

}
