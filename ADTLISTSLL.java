import java.util.*;
import java.io.*;
class ADTLISTSLL
{
	public static void main(String args[])
	{
		ADTLISTSLLOPERATIONS l = new ADTLISTSLLOPERATIONS();
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("enter your choice \n ");
			System.out.println("1.insert\n2.delete\n3.search\n4.display\n5.size\n6.exit");
			switch(sc.nextInt())
			{
				
				case 1 : System.out.println("enter element to insert ");
					 l.insert(sc.nextInt());
					 break;
				case 2 : System.out.println("enter element to delete ");
					 l.delete(sc.nextInt());
					 break;
				case 3 : System.out.println("enter element to search ");
					 l.search(sc.nextInt());
					 break;
				case 4 :l.display();
					 break;
				case 5 :l.size();
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

abstract class ADTLISTSLLSPECIFICATIONS
{
	node head;
	abstract public node create(int element);
	abstract public void insert(int element);
	abstract public void delete(int element);
	abstract public void search(int element);
	abstract public void display();
	abstract public void size();
		
}


class ADTLISTSLLOPERATIONS extends ADTLISTSLLSPECIFICATIONS
{
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
		}
		else
		{
			node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = create(element);
		}
	}
	public void delete(int element)
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			node prev = null;
			node temp = head;
			while(temp.data!= element&&temp.next!= null)
			{
				prev = temp;
				temp = temp.next;
			}
			if(temp!=null)
			{
				if(temp.data==head.data)
					head=head.next;
				else
					prev.next= temp.next;
			}
			else
			{
				System.out.println("element not found");
			}
		}
	}
	public void search(int element)
	{
		int count = 0;
		if(head==null)
			System.out.println("list is empty");
		else
		{
			node temp = head;
			while(temp.data!=element&&temp.next!=null)
			{
				temp = temp.next;
				count++;
			}
			if(temp!=null)
			{
				count++;
				System.out.println("element found at position :"+count);
			}
			else
			{
				System.out.println("element not found");
			}
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
		int c=0;
		node temp = head;
		while(temp!=null)
		{
			temp=temp.next;
			c++;
		}
		System.out.println("size of list is : "+c);
	}
}
