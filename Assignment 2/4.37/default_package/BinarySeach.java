package default_package;

public  class BinarySeach {
	
	public static void main(String[] args) {
		  BinarySearchTree tree=new BinarySearchTree();
		  tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(60);
	        tree.insert(80);
//	        tree.inorder();
	        
	        firstFind(tree, 30, 80);
	}
		
	public static void firstFind(BinarySearchTree T, int k1,int k2)
	{
		if(k1 >k2)
		{
			System.out.println("incorrect ");
			return;			
		}
	
		if(T.root== null)
			return;
		if(T.root.key==k1)
		{
			if(T.root.right != null)
				print(T,k2);
			System.out.println(T.root.key);	
			return;
			
		}
		BinarySearchTree p =T;
		if(T.root.key<=k1)
		{
			T.root = T.root.right;
			System.out.println(" right");
			firstFind(T, k1,k2);
			if(T.root.key ==k1)
				print(p,k2);
			
		}
		else {
			
			T.root= T.root.left;
			System.out.println(" left");
			firstFind(T, k1, k2);
			System.out.println(T.root.key + " " + p.root.key);
			if(T.root.key ==k1)
				print(p,k2);
			
		}
		
		
	}
	
	private static void print(BinarySearchTree T,int k2)
	{
		if(T.root == null)
			return;
		System.out.println(T.root.key);
		if(T.root.key==k2)
		{
		//	System.out.println(k2);
			return;
		}
		
		
			T.root = T.root.right;
			print(T,k2);
		
	
	}
}
