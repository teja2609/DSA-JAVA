import java.util.*;
import java.io.*;
import java.lang.*;

class Palindrome
{
	public static void main(String args[])
	{
		System.out.println("enter the input sequence");
		Scanner sc = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		Queue<Character> q = new LinkedList<Character>(); 
		char[] in = sc.next().toCharArray();
		for(int i = 0;i<in.length;i++)
		{
			s.push(in[i]);
			q.add(in[i]);
		}
		for(int j = 0;j<in.length;j++)
		{
			if(s.pop() !=q.remove())
			{
				System.out.println("Input is not Palindrome");
				return;
			}	
		}
		System.out.println("Input is Palindrome");
  
		
	}
}
