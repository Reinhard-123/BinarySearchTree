
package trees2;

import java.util.Random;

public class Trees2 {

    
    public static void main(String[] args) {
        
        BST myTree = new BST();
        
        Random rnd = new Random();
        
        myTree.root = new Node(rnd.nextInt(11));
        for(int i = 0; i < 10; i++) {
            myTree.insertNode(myTree.root, rnd.nextInt(11));
        }
        
        System.out.print("This is myTree in PreOrder Traversal:"); 
        myTree.traversePreOrder(myTree.root);
        System.out.println();
        
        System.out.print("This is myTree in Order Traversal:");
        myTree.traverseInOrder(myTree.root);
        System.out.println();
        
        System.out.print("This is myTree in PostOrder Traversal");
        myTree.traversePostOrder(myTree.root);
        System.out.println();
        
        
        
    }//main
    
    
}//class Trees2
