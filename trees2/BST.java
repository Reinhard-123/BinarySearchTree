
package trees2;


public class BST {
    
    public Node root;
    
    public void insertNode(Node node, int value) {
        
        if(value < node.value) {
            if(node.left == null) {
                node.left = new Node(value);
            }
            else {
                insertNode(node.left, value);
            } 
        }
        else if(value > node.value) {
            if(node.right == null) {
                node.right = new Node(value);
            }
            else {
                insertNode(node.right,value);
            }
        }
        
        
    }//insertNode
    
    
    public void traversePreOrder(Node node) {
       
        if(node!= null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
        
    }//traversePreOrder method
    
    public void traverseInOrder(Node node) {
        
        if(node!= null) {
            
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
            
        }
        
        
    }//inorder method
    
    
    public void traversePostOrder(Node node) {
        
        if(node!= null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
        
    }//postOrder
    
    
    
    
}//BinarySearchTree class
