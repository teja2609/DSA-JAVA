import java.util.*;
import java.io.*;
class ADTSTACKSLL
{
	public static void main(String args[])
	{
		ADTSTACKSLLOPERATIONS l = new ADTSTACKSLLOPERATIONS();
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

abstract class ADTSTACKSLLSPECIFICATIONS
{
	node head;
	abstract public node create(int element);
	abstract public void insert(int element);
	abstract public void delete();
	abstract public void display();
	abstract public void size();
		
}


class ADTSTACKSLLOPERATIONS extends ADTSTACKSLLSPECIFICATIONS
{
	int top =-1;
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
			top++;
		}
		else
		{
			node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = create(element);
			top++;
		}
	}
	public void delete()
	{
		if(top==-1)
			System.out.println("stack is empty");
		else
		{
			node prev = null;
			node temp = head;
			while(temp.next!= null)
			{
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
			top--;
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
		
		System.out.println("size of list is : "+top);
	}
}
