package Lec_34;

public class Stack
{
	protected int[] arr;
	private int tos;
	
	public Stack()
	{
		arr = new int[5];
		tos = -1;
	}
	public Stack(int cap)
	{
		arr = new int[cap];
		tos = -1;
	}
	public boolean isEmpty()
	{
		return tos == -1;
	}
	public boolean isfull()
	{
		return tos == arr.length -1;
	}
	public void push(int item) throws Exception
	{
		if(isfull())
		{
			throw new Exception("Bklol Stack full hai");
		}
		tos++;
		arr[tos] = item;
	}
	public int size()
	{
		return tos+1;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Bklol Stack khaali hai");
		}
		int val = arr[tos];
		tos--;
		return val;
	}
	public int peek() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Bklol Stack khaali hai");
		}
		int val = arr[tos];
		return val;
	}
	public void Display()
	{
		for(int i =0;i<=tos;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}




