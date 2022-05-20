package hash;
//problem 5.3
public class ColisionHandler {

	private static int[] linear,quad,dob ;

	public static void main(String[] args) {
		int[] heap = new int[10];
		linear = new int[10];
	//	quad = new int
	
		int d = ColliosionFinder(heap);
		System.out.println(d);
	}
	public static int  ColliosionFinder(int[] heap)
	{
		int count = 0;
		for(int i=1; i<=100; i++)
		{
			int r = (int) (Math.random()*100);
			//System.out.println(r);
			if(heap[r%10] !=0)
				count++;
			heap[r%10] = r;
		}
		
		return count;
	}

}
