import java.util.Scanner;
public class quicksort
{
	public static void main(String args[])
	{
		System.out.println("enter size of list");
		int n,i,lb,ub;	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter elements to be sorted");
		for(i=0;i<n;i++)
		{
			 a[i] = sc.nextInt();
		}
		qsort(a,0,n-1);
		System.out.println("sorted elements are \n");
		for(i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
		 
	}
	public static void qsort(int a[],int lb,int ub)
	{
		int pos;
		if(lb<ub)
		{
			pos = partition(a,lb,ub);
			qsort(a,lb,pos-1);
			qsort(a,pos+1,ub);
		}
	}
	public static int partition(int a[],int lb,int ub )
	{
		int i=lb,j=ub;
		int pivot = a[lb];
		int t;
		while(i<j)
		{
			while(a[i]<=pivot&&i<ub)
				i = i+1;
			while(a[j]>pivot)
				j = j-1;
			if(i<j)
			{
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
			

		}
		a[lb] = a[j];
		a[j] = pivot;
		return j;
				
	}


}
