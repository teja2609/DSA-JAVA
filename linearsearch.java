import java.util.Scanner;
class linearsearch
{
	public static void main(String[] args){
	System.out.println("enter number of elements");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println("enter element to search");
	int key = sc.nextInt();
	int poe =ls(a,key,n);
	if(poe==-1)
		System.out.println("element not found");
	else
		System.out.println("position of element is :"+poe);
}
	static int ls(int a[],int key,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
				return i;
		}
		return -1;	
			
	}
}
