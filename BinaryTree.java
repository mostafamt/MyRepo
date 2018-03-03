
public class BinaryTree
{
    public Node root ;

    public void insert(int key)
    {
        Node node = new Node(key);
        if(root == null)
            root = node ;
        else
        {
            Node current = root ;
            Node parent = root ;
            while(true)
            {
                parent = current ;
                if(key > current.data)
                {
                    current = current.rightChild ;
                    if(current == null)
                    {
                        parent.rightChild = node ;
                        break;
                    }
                }
                else
                {
                    current = current.leftChild ;
                    if(current == null)
                    {
                        parent.leftChild = node ;
                        break;
                    }
                }

            }
        }

    }


    public boolean search(int key)
    {
        Node current = root ;
        while(current.data != key)
        {
            if(current.data > key)
                current = current.leftChild ;
            else
                current = current.rightChild ;
            if(current == null)
                return false ;
        }
        return true ;
    }


    public void delete(int key)
    {

    }


    public void inorder(Node node)
    {
        if(node != null)
        {
            inorder(node.leftChild);
            System.out.print(node.data +" ");
            inorder(node.rightChild);
        }
    }

    public void preorder(Node node)
    {
        if(node != null)
        {
            System.out.print( node.data+" " );
            preorder(node.leftChild);
            preorder(node.rightChild);
        }
    }

    public void postorder(Node node)
    {
        if(node != null)
        {
            postorder(node.leftChild);
            postorder(node.rightChild);
            System.out.print(node.data+" ");
        }
    }
}


class Node
{
    int data ;
    Node rightChild ;
    Node leftChild ;
    Node p ;

    public Node(int data)
    {
        this.data = data ;
    }
}


class  MAIN
{
    public static void main(String[] args)
    {
        BinaryTree bst = new BinaryTree();

        bst.insert(3);
        bst.insert(1);
        bst.insert(2);
        insert(bst , new Node(4));
        insert(bst , new Node(800));
        insert(bst , new Node(112));

        bst.inorder(bst.root);

    }

    static void insert(BinaryTree T , Node z)
    {
        Node x = T.root;
        Node y = null ;
        while(x != null)
        {
            y = x ;
            if(z.data > x.data)
                x =x. rightChild;
            else x =x.leftChild;
        }
        z.p = y ;
        if(y==null) T.root = z ;
        else if(z.data > y.data)
            y.rightChild = z ;
        else y.leftChild = z ;
    }

}

