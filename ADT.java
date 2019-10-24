import java.io.*;
import java.util.*;
public class ADT
{
	public static void main(String args[])
	{
		ADTOPERATIONS l = new ADTOPERATIONS();
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("enter your choice\n 1.insert \n 2. delete \n 3. display \n 4.size \n 5.exit");
			int a = sc.nextInt();
			switch(a)
			{
				case 1: System.out.println("enter element to insert");
					l.insert(sc.nextInt());
					break;
				case 2: System.out.println("enter index of element to delete");
					l.delete(sc.nextInt());
					break;
				case 3: System.out.println("list of elements are:\n");
					l.display();
					break;
				case 4: System.out.println("size of list is");
					l.size();
					break;
				case 5:loop=false;
					break;
			       default: System.out.println("invalid choice");
					break; 
			}
		}
	}
}

interface ADTSPECIFICATIONS
{
	int[] arr = new int[100];
	public void insert(int element);
	public void delete(int index);
	public void display();
	public void size();
}

 class ADTOPERATIONS implements ADTSPECIFICATIONS
{
	int n=0;
	public void insert(int element)
	{
		arr[n] = element;
		n++;
	}
	public void delete(int index)
	{
		if(n==0)
			System.out.println("list is empty");
		else if(index>=n)
			System.out.println("no element in the list");
		else
		{
			int temp = arr[index];
			System.out.println("deleted element is "+temp);
			for(int i=index;i<n;i++)
			{
				arr[i] = arr[i+1];
			}
		}	
	}
	public void display()
	{
		System.out.println("elements in list are:");
		for(int j=0;j<n;j++)
			System.out.println("  "+arr[j]);
	}
	public void size()
	{
		System.out.println(+n);

	}


}
			
			
				
