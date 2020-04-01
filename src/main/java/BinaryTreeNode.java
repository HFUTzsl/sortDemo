import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//实现一棵二叉树（比普通的二叉树容易，因为二叉树仅有左右两个子节点）
public class BinaryTreeNode {

    private int data;  //数据
    private BinaryTreeNode leftChirld;  //左孩子
    private BinaryTreeNode rightChirld; //右孩子

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public BinaryTreeNode getLeftChirld() {
        return leftChirld;
    }
    public void setLeftChirld(BinaryTreeNode leftChirld) {
        this.leftChirld = leftChirld;
    }
    public BinaryTreeNode getRightChirld() {
        return rightChirld;
    }
    public void setRightChirld(BinaryTreeNode rightChirld) {
        this.rightChirld = rightChirld;
    }

    //前序遍历
    public void preOrder(BinaryTreeNode node){
    if(node!=null){
        System.out.println(node.getData()); //先访问根节点
        preOrder(node.getLeftChirld());  //先根遍历左子树
        preOrder(node.getRightChirld());  //先根遍历右子树
        }
    }

    //中序遍历
    public void midOrder(BinaryTreeNode node){
        if(node!=null){
            midOrder(node.getLeftChirld());  //先根遍历左子树
            System.out.println(node.getData()); //先访问根节点
            midOrder(node.getRightChirld());  //先根遍历右子树
        }
    }
    //后序遍历
    public void postOrder(BinaryTreeNode node){
        if (node != null){
            postOrder(node.getLeftChirld());//先遍历左子树
            postOrder(node.getRightChirld());//再遍历右子树
            System.out.println(node.getData());//最后遍历根节点
        }
    }
    //层序遍历
    public List<List<Integer>> levelOrder(BinaryTreeNode node) {
        if(node == null){
            return new ArrayList();
        }
        List<List<Integer>> res = new ArrayList();
        Queue<BinaryTreeNode> queue = new LinkedList();
        queue.add(node);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while(count>0){
                BinaryTreeNode node1 = queue.poll();
                list.add(node1.getData());
                if(node1.getLeftChirld() != null){
                    queue.add(node1);
                }
                if(node1.rightChirld != null){
                    queue.add(node1.rightChirld);
                }
                count--;
            }
            res.add(list);
        }
        return res;
    }
}
