
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BKStack s;
		s= new ArrayStack();
		//s.pop();
		s.push(2.4);
		s.push(1.5);
		s.push(3.14);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		for(int i =1;i<=30;i++)
		{
			s.push(Math.PI*i);
		}
		
		System.out.println(s.peek());
		for(int i=1; i<=10;i++)
		{
			System.out.println(s.pop());
			System.out.println(s.peek());
		}
		System.out.println(s.pop());
	}

}
