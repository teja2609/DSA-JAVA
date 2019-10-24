import java.io.*;
import java.util.*;
class CQUEUEADT
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
	int n = 5;
	int [] arr = new int[n];
	public void insert(int element)
	{
		if((rear+1)%n==front)
			System.out.println("overflow");
		else if(front==-1&&rear==-1)
		{
			front++;
			rear++;
			arr[rear]=element;System.out.println("rear="+rear + "front ="+front);
		}
		else
		{
			rear = (rear+1)%n;
			arr[rear]=element;System.out.println("rear="+rear + "front ="+front);
			
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
			front = -1;
			rear = -1;
			System.out.println("rear="+rear + "front ="+front);
		}
		else
		{
			System.out.println("deleted element is :"+arr[front]);
			front = (front+1)%n;System.out.println("rear="+rear + "front ="+front);
		}
	}
	public void display()
	{
		
		if (front == -1) 
    		{ 
        		System.out.println("Queue is Empty"); 
        		return; 
    		} 
    		System.out.println("Elements in Circular Queue are: "); 
    		if (rear >= front) 
    		{ 
        		for (int i = front; i <= rear; i++) 
            		System.out.print(" "+arr[i]); 
    		} 
    		else
    		{ 
        		for (int i = front; i < 5; i++) 
            		System.out.print(" "+arr[i]); 
  
        		for (int i = 0; i <= rear; i++) 
            		System.out.print(" "+arr[i]); 
    		} 
	System.out.println();
	}
	public void size()
	{
		System.out.println(""+arr[(rear-front)+1]);
	}
		
	
}
