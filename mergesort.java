import java.util.Scanner;
public class mergesort
{
	
	public static void main(String args[])
	{
		System.out.println("enter size of the list");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter elements to be sorted");
		int a[] = new int[n];
		for(int i=0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
	        msort(a,0,n-1);
		System.out.println("sorted elements are");
		for(int i=0; i<n;i++)
		{
			System.out.print(" "+a[i]);
			
		}
		
	}
	public static void msort(int[] a,int lb,int ub)
	{
		if(lb < ub)
		{	
		msort(a,lb,(lb+ub)/2);
		msort(a,(lb+ub)/2 +1 , ub);
		merge(a,lb,(lb+ub)/2,ub);
		}
	}
	public static void merge(int a[],int lb,int mid, int ub)
	{
		int i = lb;
		int j = ub;
		int k = lb;
		int[] b = new int[ub + 1];
		while(i<=mid&&j<=ub)
		{
			if(a[i]<a[j])
			{
				b[k] = a[i];
				i++;
				k++;	
			}
			else
			{
				b[k] = a[j];
				j++;
				k++;
			}
			
		}
		while(i<=mid)
		{
			b[k] = a[i];
			i++;
			k++;
		}
		while(j<=ub)
		{
			b[k] = a[j];
			j++;
			k++;
		}
		for(int c = lb ; c <= ub ; c++)
		{
			System.out.print(" "+b[c]);
			 a[c] = b[c];
		}
		System.out.println("ub="+ub +" lb = "+lb);
	}


}
