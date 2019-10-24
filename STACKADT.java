import java.util.*;
import java.io.*;
public class STACKADT
{
	public static void main(String args[])
	{
		STACKADTOPERATIONS l = new STACKADTOPERATIONS();
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("enter your choice \n 1.insert \n 2. delete \n 3.diplay \n 4.size \n 5.exit ");
			switch(sc.nextInt())
			{
				case 1 : System.out.println("enter element to be inserted");
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


interface STACKADTSPECIFICATIONS
{
	int [] arr = new int[100];
	public void insert(int element);
	public void delete();
	public void display();
	public void size();
}

class STACKADTOPERATIONS implements STACKADTSPECIFICATIONS
{
		int top = -1;
		public void insert(int element)
		{
			if(top>=100)
				System.out.println("stack is full");
			else 
			{	arr[top+1] = element;
				top++;
			}
		}
		public void delete()
		{
			if(top==-1)
				System.out.println("stack is empty");
			else
			{
				int temp = arr[top];
				System.out.println("deleted element is"+temp);
				top--;
			}
		}
		public void display()
		{
			System.out.println("elements in stack are :");
			for(int i=0;i<=top;i++)
			{
				System.out.println("  " +arr[i]);
			}
			
		}
		public void size()
		{
			
			System.out.println("size of stack is :"+(top+1));
		}
}
