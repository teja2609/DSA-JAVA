import java.io.*;
import java.util.*;
class QUEUEADT
{
	public static void main(String args[])
	{
		QUEUEADTOPERATIONS l = new QUEUEADTOPERATIONS();
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("enter your choice \n 1.insert\n 2.delete \n 3.display \n 4.size \n 5.exit");
			switch(sc.nextInt())
			{
				case 1: System.out.println("enter element to insert");
					l.insert(sc.nextInt());
					break;
				case 2 : l.delete();
					 break;
				case 3 : l.display();
					 break;
				case 4 : l.size();
					 break;
				case 5 : loop = false;
					 break;
				default : System.out.println("invalid choice");
					 break;
			}
		}
	}
}

interface QUEUEADTSPECIFICATIONS
{
	public void insert(int element);
	public void delete();
	public void display();
	public void size();
}


class QUEUEADTOPERATIONS implements QUEUEADTSPECIFICATIONS
{
	int front = -1;
	int rear = -1;
	int n=3;
	int [] arr = new int[n];
	public void insert(int element)
	{
		if(rear>=n-1)
			System.out.println("overflow");
		else if(front==-1&&rear==-1)
		{
			front++;
			rear++;
			arr[rear]=element;

		}
		else
		{
			
			rear++;
			arr[rear]=element;
		}
	}
	public void delete()
	{
		if(front==-1&&rear==-1)
		{
			System.out.println("underflow");
		}
		else if(front==rear)
		{
			System.out.println("deleted element is :"+arr[front]);
			front--;
			rear--;
		}
		else
		{
			System.out.println("deleted element is :"+arr[front]);
			front++;
		}
	}
	public void display()
	{
		System.out.println("elements in list are ");	
		for(int i=front;i<rear;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
	public void size()
	{
		System.out.println(""+arr[(rear-front)+1]);
	}
		
	
}
