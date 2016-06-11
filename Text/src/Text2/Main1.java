package Text2;

/**
 *
 * 构建二叉树，并且用先序，中序，后序3种方式遍历
 * @author 马宁
 * @date 2016年4月28日 下午11:13:13
 */
public class Main1 {

	public TreeNode init() {//注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错
		TreeNode Q = new TreeNode(9, null, null);
		TreeNode O = new TreeNode(8, null, null);
		TreeNode N = new TreeNode(7, null, Q);
		TreeNode L = new TreeNode(10, null, null);
		TreeNode J = new TreeNode(11, null, null);
		TreeNode G = new TreeNode(6, N, O);
		TreeNode F = new TreeNode(5, L, null);
		TreeNode E = new TreeNode(4, J, null);
		TreeNode C = new TreeNode(3, F, G);
		TreeNode B = new TreeNode(2, null, E);
		TreeNode A = new TreeNode(1, B, C);
	    return A;   //返回根节点
	}
	
	public void printNode(TreeNode node) {
		System.out.print(node.getVal());
	}

	public void theFirstTraversal(TreeNode root) { // 先序遍历
		printNode(root);
		if (root.getLeft() != null) { // 使用递归进行遍历左子樹
			theFirstTraversal(root.getLeft());
		}
		if (root.getRight() != null) { // 递归遍历右子樹
			theFirstTraversal(root.getRight());
		}
	}

	public void theInOrderTraversal(TreeNode root) { // 中序遍历
		if (root.getLeft() != null) {
			theInOrderTraversal(root.getLeft());
		}
		printNode(root);
		if (root.getRight() != null) {
			theInOrderTraversal(root.getRight());
		}
	}

	public void thePostOrderTraversal(TreeNode root) { // 后序遍历
		if (root.getLeft() != null) {
			thePostOrderTraversal(root.getLeft());
		}
		if (root.getRight() != null) {
			thePostOrderTraversal(root.getRight());
		}
		printNode(root);
	}
	
	public static void main(String[] args) {
		
		Main1 tree = new Main1();
		TreeNode root = tree.init();
	    System.out.println("先序遍历");
	    tree.theFirstTraversal(root);
	    System.out.println("");
	    System.out.println("中序遍历");
	    tree.theInOrderTraversal(root);
	    System.out.println("");
	    System.out.println("后序遍历");
	    tree.thePostOrderTraversal(root);
	    System.out.println("");
	}

}
/** 
 * 创建内部节点类 
 **/
class TreeNode {
	public int val;//      节点对应的值
	public TreeNode left;//      左节点
	public TreeNode right;//      右节点

	public TreeNode(int val,TreeNode left, TreeNode right) {
		super();
		this.val = val;
		this.left = left;
	    this.right = right;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}
 