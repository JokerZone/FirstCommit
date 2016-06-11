package Filedfile;


/**
 *
 * 构建二叉树，并且用先序，中序，后序3种方式遍历
 * @author 马宁
 * @date 2016年4月28日 下午11:13:13
 */
public class Main2_1 {

	private TreeNode root;
	
	public Main2_1(){  
	    root = null;  
	}
	
	/* 
     *递归的创建二叉树 
     * */  
    public void buildTree(TreeNode node ,int val){  
        if (root == null){// 如果根节点为空，创建根节点  
            root = new TreeNode(val);  
        }else{  
            if(val <node.val){//插入到左子树  
                if(node.left == null){//左节点为空，直接创建值为data的左节点  
                    node.left = new TreeNode(val);  
                }else{//左节点不为空，调用buildTree函数插到左子树中  
                    buildTree(node.left,val);  
                }  
            }else{  
                if(node.right == null){  
                    node.right = new TreeNode(val);  
                }else{  
                    buildTree(node.right,val);  
                }  
            }         
        }  
    }//end buildTree 
	
    /* 
     *前序遍历二叉树 
     * */  
    public void preOrder(TreeNode node){  
        if(node != null){  
            System.out.print(node.val);  
            preOrder(node.left);  
            preOrder(node.right);  
        }  
    }  
    /* 
     *中序遍历二叉树 
     * */  
    public void inOrder(TreeNode node){  
        if(node != null){  
            inOrder(node.left);  
            System.out.print(node.val);  
            inOrder(node.right);  
        }  
    }  
    /* 
     *后序遍历二叉树 
     * */  
    public void postOrder(TreeNode node){  
        if(node != null){  
            postOrder(node.left);  
            postOrder(node.right);  
            System.out.print(node.val);              
        }  
    }
    
	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,6,7,8,9,10,11};  
		Main2_1 binTree = new Main2_1();  
        for(int i = 0; i<a.length; i++){  
            binTree.buildTree(binTree.root, a[i]);  
        }  
        System.out.print("前序遍历");  
        binTree.preOrder(binTree.root);  
        System.out.println("");  
        System.out.print("中序遍历");  
        binTree.inOrder(binTree.root);  
        System.out.println("");  
        System.out.print("后序遍历");  
        binTree.postOrder(binTree.root);
	}

}
/** 
 * 创建内部节点类 
 **/
class TreeNode {
	public int val;//      节点对应的值
	public TreeNode left;//      左节点
	public TreeNode right;//      右节点

	public TreeNode(int val) {
		super();
		this.val = val;
	}
}
 