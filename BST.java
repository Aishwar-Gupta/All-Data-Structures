class BST
{
    private class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    Node root;

    public void insert_iterative(int data)
    {
        Node new_node = new Node(data);

        if(root == null)
        {
            root = new_node;
        }
        else
        {
            Node itr = root;

            while(itr != null)
            {
                if(itr.data == data)
                {
                    // System.out.println("Duplicate Data!");
                    return ;
                }
                else if(itr.data > data && itr.left == null)
                {
                    itr.left = new_node;
                }
                else if(itr.data > data)
                {
                    itr = itr.left;
                }
                else if(itr.data < data && itr.right == null)
                {
                    itr.right = new_node;
                }
                else 
                {
                    itr = itr.right;
                }
            }
        }
    }

    // public Node insertrecursive(Node root, int data)
    // {
    //     if(root == null)
    //     {
    //         root = new Node(data);
    //         return root;
    //     }

    //     else if(root.data > data)
    //     {
    //         if(root.left == null)
    //         {
    //             root.left = new Node(data);
    //         }
    //         else
    //         {
    //             insertrecursive(root.left, data);
    //         }
    //     }

    //     else
    //     {
    //         if(root.right == null)
    //         {
    //             root.right = new Node(data);
    //         }
    //         else
    //         {
    //             insertrecursive(root.right, data);
    //         }
    //     }
    //     return root;
    // }

    // public void insert_recursive(int data)
    // {
    //     insertrecursive(root, data);
    // }

    public void in_order(Node root)
    {
        if(root == null)
        {
            return ;
        }
        in_order(root.left);
        System.out.print(root.data + "  ");
        in_order(root.right);
    }

    public void pre_order(Node root)
    {
        if(root == null)
        {
            return ;
        }
        System.out.print(root.data + "  ");
        pre_order(root.left);
        pre_order(root.right);
    }

    public void post_order(Node root)
    {
        if(root == null)
        {
            return ;
        }
        post_order(root.left);
        post_order(root.right);
        System.out.print(root.data + "  ");
    }

    public void inorder()
    {
        System.out.print( "\nIn-order - ");
        in_order(root);
    }

    public void preorder()
    {
        System.out.print(" \nPre-order - ");
        pre_order(root);
    }

    public void postorder()
    {
        System.out.print("\nPost-order - ");
        post_order(root);
    }

    public void contain(Node root, int data)
    {
        if(root == null)
        {
            System.out.println("\nTree is EMPTY!");
            return ;
        }
        else if(root.data == data)
        {
            System.out.println("\nData FOUND in Tree!");
        }
        else if(root.data > data)
        {
            if(root.left == null)
            {
                System.out.println("\nData NOT in Tree!");
                return ;
            }
            else
            {
                contain(root.left, data);
            }
        }

        else
        {
            if(root.right == null)
            {
                System.out.println("\nData NOT in Tree!");
                return;
            }
            else
            {
                contain(root.right, data);
            }
        }
    }

    public void contains(int data)
    {
        contain(root, data);
    }

    public void print_leaf(Node root)
    {
        if(root.left == null && root.right == null)
        {
            System.out.print(root.data + " ");
            return ;
        }
        print_leaf(root.left);
        print_leaf(root.right);
    }

    public void leaf()
    {
        System.out.print("The LEAF nodes are - ");
        print_leaf(root);
    }

    public int sum_of_leaf(Node root)
    {
        int sum = 0;
        if(root.left == null && root.right == null)
        {
            return root.data; 
        }
        sum += sum_of_leaf(root.left);
        sum += sum_of_leaf(root.right);
        return sum;
    }

    public void leaf_sum()
    {
        int sum = sum_of_leaf(root);
        System.out.println("\nSum of the leaf nodes = " + sum);
    }

    public static void main(String[] args)
    {
        BST bst = new BST();
        bst.insert_iterative(5);
        bst.insert_iterative(3);
        bst.insert_iterative(4);
        bst.insert_iterative(2);
        bst.insert_iterative(7);
        bst.insert_iterative(8);
        bst.insert_iterative(6);
        bst.inorder();
        bst.preorder();
        bst.postorder();
        bst.contains(60);
        bst.leaf();
        bst.leaf_sum();

    }
}