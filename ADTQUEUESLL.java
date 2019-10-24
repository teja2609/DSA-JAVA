import java.util.*;
import java.io.*;
class ADTQUEUESLL
{
	public static void main(String args[])
	{
		ADTQUEUESLLOPERATIONS l = new ADTQUEUESLLOPERATIONS();
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("enter your choice \n ");
			System.out.println("1.insert\n2.delete\n3.display\n4.size\n5.exit");
			switch(sc.nextInt())
			{
				
				case 1 : System.out.println("enter element to insert ");
					 l.insert(sc.nextInt());
					 break;
				case 2 : l.delete();
					 break;
				case 3 :l.display();
					 break;
				case 4 :l.size();
					 break;
				case 5 : loop = false;
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

abstract class ADTQUEUESLLSPECIFICATIONS
{
	node head;
	abstract public node create(int element);
	abstract public void insert(int element);
	abstract public void delete();
	abstract public void display();
	abstract public void size();
		
}


class ADTQUEUESLLOPERATIONS extends ADTQUEUESLLSPECIFICATIONS
{
	int front = -1;
	int rear  = -1;
	public node create(int element)
	{
		node s = new node();
		s.data = element;
		s.next = null;
		return s;
	}
	public void insert(int element)
	{
		if(head== null)
		{
			System.out.println("creating head of list");
			head = create(element);
			front++;
			rear++;
		}
		else
		{
			node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = create(element);
			rear++;
		}
	}
	public void delete()
	{
		if(front==-1)
			System.out.println("queue is empty");
		else if(front == rear)
		{
			System.out.println("deleted element is :"+head.data);
			head = head.next;
			rear=-1;
			front =-1;
				
		}
		else
		{
			head = head.next;
			front++;
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
	public void size()
	{
		int s = (rear-front)+1;
		System.out.println("size of list is : "+s);
	}
}
