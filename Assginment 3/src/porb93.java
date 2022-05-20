import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


//problem 9.3
class vertex
	{
		int  val, deg,topNum;
		ArrayList<vertex> neighbor;
		vertex(){
			neighbor = new ArrayList<>();
			deg =0;
		}
		void adj(vertex v)
		{
			neighbor.add(v);
			deg++;
		}
		
	}
public class porb93 {
	public static void topsort(ArrayList<vertex> vertices)
	{
		Queue<vertex> q = new LinkedList<>();
		int counter =0;
		for(vertex v :vertices)
		{
			if(v.deg==0)
			{
				q.add(v);
			}
		}
		while(!q.isEmpty())
		{
			vertex v = q.poll();
			v.topNum= ++counter;
		 for (vertex ver :v.neighbor  )
		 {
			 if(--ver.deg==0)
				 q.add(ver);
			 
		 }
		}
	}
}
