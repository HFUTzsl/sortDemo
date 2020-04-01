
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
            postOrder(node.getLeftChirld());
            postOrder(node.getRightChirld());
            System.out.println(node.getData());
        }
    }
}
