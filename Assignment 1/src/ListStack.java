import java.util.EmptyStackException;

//private class

public class ListStack implements BKStack
{
	private class ListStackNode{
		double val;
		ListStackNode next;
		public ListStackNode( double val) 
		{
			this.val = val;
			// TODO Auto-generated constructor stub
		}
		public ListStackNode(double val,ListStackNode next)
		{
			this.val = val;
			this.next = next;
		}
	}
	
	private ListStackNode top;
	
	public ListStack() {
		top =null;
	}
	
	/**
	 * the top  becomes a new value
	 * 
	 *	 */
	@Override
	public void push(double d)
	{
		top = new ListStackNode(d,this.top);
	}
	
	/**
	 * @return if the top of the linked list is empty when it is a null
	 */
	@Override
	public boolean isEmpty()
	{
		return top==null;
	}
	
	/**
	 * @return the value of top 
	 */
	@Override
	public double pop()
	{
		double d = top.val;
		top = top.next;
		return d;
	}
	
	
	public double peek()
	{
		try 
		{
		return top.val;
		} catch(EmptyStackException e)
		{
			e.getMessage();
			return -1;
		}
		
	}

}
