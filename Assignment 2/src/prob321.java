import java.util.Stack;

public class prob321 {
	public static void main(String[] args) {
		System.out.println(balance("(){}/**/"));
	}
		
	public static boolean balance(String s)
	{
		Stack<Character> c = new Stack<>();
		String open = "/* ( [ {";
		String close = "*/ ) ] }";
		if(close.contains(s.substring(0,1)))
				return false;
		c.push(s.charAt(0));
		System.out.println(c.peek());
		while(!c.isEmpty())
		{
			for(int i =0; i<s.length(); i++)
			{
				if(open.contains(s.subSequence(i,i+1)))
					c.push(s.charAt(i));
					else
					{
						char o = c.pop();
						char clo = s.charAt(i);
						
						switch(clo)
						{
						case'}': 
								if(o!='{') 
									return false;
								break;
						case']': 
							if(o!='[') 
								return false;
							break;
						case')': 
							if(o!='(') 
								return false;
							break;
						case'*': 
							if(o!='/') 
								return false;
							break;
						default: return false;
						}
					}
			}
		}
		return true;
	}
}

