import java.util.*;
import java.io.*;
class Node {
    long val;
    long pos;
    Node LeftChild;
    Node RightChild;

    Node min() {
        if (this.LeftChild == null) {
            return this;
        }
        return this.LeftChild.min();
    }
    Node FindSuccessor()
    {
    return this.min();
    }
}
class BST{
    Node insert(Node CurrentNode, long val, long pos){
        if(CurrentNode==null){
            CurrentNode = new Node();
            CurrentNode.val=val;
            CurrentNode.pos=pos;
            System.out.println(pos);
            return CurrentNode;
        }
        if (val>CurrentNode.val) {
            pos = 2 * pos + 1;
            CurrentNode.RightChild = insert(CurrentNode.RightChild, val, pos);
        }
        else if (val<CurrentNode.val){
            pos=2*pos;
            CurrentNode.LeftChild=insert(CurrentNode.LeftChild, val, pos);
        }
        return CurrentNode;
    }
    Node delete(Node currentNode, long value){
        if (value < currentNode.val){
            currentNode.LeftChild = delete(currentNode.LeftChild, value);
        } else if (value > currentNode.val){
            currentNode.RightChild = delete(currentNode.RightChild, value);
        } else {
            System.out.println(currentNode.pos);
            if (currentNode.LeftChild == null){
                return currentNode.RightChild;
            } else if (currentNode.RightChild == null){
                return currentNode.LeftChild;
            }
            currentNode.val = currentNode.RightChild.FindSuccessor().val;
            currentNode.RightChild = delete(currentNode.RightChild, currentNode.val);
        }
        return currentNode;
    }
}
public class CC2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BST tree = new BST();
        Node root = null;
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0){
            st = new StringTokenizer(br.readLine());
            char o = st.nextToken().charAt(0);
            long x = Long.parseLong(st.nextToken());
            if (o == 'i'){
                root = tree.insert(root, x, 1);
            } else if (o == 'd'){
                assert root != null;
                root = tree.delete(root, x);
            }
        }
    }
}
