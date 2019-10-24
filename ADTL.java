import java.io.*;
import java.util.*;

interface ADTList{
int[] arr = new int[100];
//static int sizeofList = 0;
public int add(int ele);
public void delete(int index);
public void display();
public void size();
}

class arrayList implements ADTList{
	public int sizeofList = 0;
	public int add (int elem)
	{	
		arr[sizeofList] = elem;
		this.sizeofList++;
		return elem;
	}
	public void delete (int index)
	{
		System.out.println("Deleting");
		if(this.sizeofList == 0)
			System.out.println("No Element to delete");
		else if(this.sizeofList <= index)
			System.out.println("No value in index "+index + " to delete" );
		else
		{
			int temp = arr[index];
			for(int i=index;i<sizeofList;i++)
			{
				arr[i] = arr[i+1];
			}
			System.out.println("Element Deleted is "+temp);
			this.sizeofList--;	
		}
		
	}
	public void display()
	{
		System.out.println("Elements in List are:");
		for(int i=0;i < sizeofList;i++)
		{
			System.out.print(" "+ arr[i]);
		}
		System.out.println("");
	}
public void size()
{
	System.out.println("size of list is"+sizeofList);
}
}

public class ADTL {
	public static void main(String[] args)
	{
		ADTList l = new arrayList();
		Scanner s = new Scanner(System.in);
		boolean loop = true;
		while (loop)
		{
			System.out.println("\n--------------------------------------------------------------------\n Enter the choice");
			System.out.println("    1. ADD 2.Delete 3.GetValue 4.SetValue 5.Size 6.Display 7.Exit");
			switch(s.nextInt())
			{
				case 1: System.out.println("\nEnter the element to add:");l.add(s.nextInt());break;
				case 2: System.out.println("\nEnter the index of element to delete:");
						l.delete(s.nextInt());
						break;
				case 3: System.out.println("\nEnter the index of element to Get value:");
						System.out.println(l.arr[s.nextInt()]);
						break;
				case 4: System.out.println("\nEnter the index of element to Set value:");
						break;
				case 5: l.size();break;
				case 6: l.display();break;
				case 7: loop = false;System.out.println("Thanks\n--------------------------------------------------------------------");break;
				default: System.out.println("\n Invalid Choice");break;
			}
			
		}
	}
	
	
	
}