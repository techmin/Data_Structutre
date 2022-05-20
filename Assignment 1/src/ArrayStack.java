import java.util.EmptyStackException;

public class ArrayStack implements BKStack
{
	private double list[];
	private int size;
	public ArrayStack() {
		// TODO Auto-generated constructor stub
		list = new double[25]; //size of list is 25 
		size = 0;
	}
	/**
	 * @return if the list is empty 
	 * checking the size being 0 indicating there is no element in the list
	 */
	@Override
	public boolean isEmpty()
	{
		return size ==0;
	}
	/**
	 * adding a the end 
	 * adding at the current size
	 */
	@Override
	public void push(double d)
	{
		if(size == list.length)
		{
			doubleSize();
		}
		list[size] = d;
		//adder++;
		size++;
		
	}
	private void doubleSize()
	{
		double d[] = new double[list.length*2];
		for(int i=0; i<list.length;i++)
			d[i]=list[i];
		list =d;
	}
	
	/**
	 * @return last element that is put and deleted
	 * moving the index position to back
	 */
	public double pop()
	{
		try {
			size--;
			return list[size];
		} catch(EmptyStackException e)
		{
			e.getMessage();
			return (Double) null;
		}
	}
	
	public double peek()
	{
		try {
			return list[size-1];
		} catch(EmptyStackException e)
		{
			e.getMessage();
			return (Double) null;
		}
	}
	

}
