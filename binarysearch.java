import java.util.Scanner;
class binarysearch
{

	public static void main(String args[])
	{
		System.out.println("enter number of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter elements");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("enter element to search");
		int key = sc.nextInt();
		int poe = binarysearch(a,0,n-1,key);
		if(poe==-1)
			System.out.println("element not found");
		else
			System.out.println("position of element is :"+poe);
	}
	public static int binarysearch(int a[] ,int p,int q,int key)
	{
		int mid = (p+q)/2;
		if(q>=p)
		{
			if(key==a[mid])
			return mid;
			if(key<mid)
			return binarysearch(a,0,mid-1,key);
			if(key>mid)
			return binarysearch(a,mid+1,q,key);
		}
		return -1;

	}
			
	
}
