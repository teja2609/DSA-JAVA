import java.util.Scanner;
public class bubblesort
{
	public static void main(String args[])
	{
		int n;
		System.out.println("enter size of list ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter elements to be sorted ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		bsort(a,n);
		System.out.println("sorted list \n ");
		for(int i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
		
	}
	public static void bsort(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j= 0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}	

}
