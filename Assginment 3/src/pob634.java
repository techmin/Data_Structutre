//problem 6.34
  class Tree 
	{
		int val;
		Tree left,right;
		Tree(int d)
		{
			val=d;
		}
	}
	
public class pob634 {
	
	public static void main(String[] args) {
		Tree t = new Tree(3);
		insert(t,5);
	}
	public static void insert(Tree root, int d)
	{
		if(root == null)
		{
			root = new Tree(d);
			return;
		}
		if(root.val >d)
		{
			Tree t = new Tree(d);
			t.left = root;
			t.right = root.right;
			root.right = null;
			return;
		}
		insert(root.left,d);
		insert(root.right,d);
	}
}
