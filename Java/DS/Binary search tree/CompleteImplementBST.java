import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
}


class ImplementBST{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Node root = null;

        while(true){
            System.out.print("Enter 1 to insert, 2 to search, 3 to delete, 4 to print, 5 to get minimum, 6 to get maximum, 7 to get size, 8 to exit : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the data to insert : ");
                    int data = sc.nextInt();
                    root = insert(root, data);
                    break;
                case 2:
                    System.out.print("Enter the data to search : ");
                    int searchData = sc.nextInt();
                    if(search(root, searchData) == 1){
                        System.out.println("Found");
                    }
                    else{
                        System.out.println("Not Found");
                    }
                    break;
                case 3:
                    System.out.print("Enter the data to delete : ");
                    int deleteData = sc.nextInt();
                    root = delete(root, deleteData);
                    break;
                case 4:
                    if(root == null){
                        System.out.println("Tree is empty");
                    }
                    else{
                        inorder(root);
                        System.out.println();
                        preorder(root);
                        System.out.println();
                        postorder(root);   
                        System.out.println();  
                    }               
                    break;
                case 5:
                    if(root == null){
                        System.out.println("Tree is empty");
                    }
                    else{
                        System.out.println("Minimum element is : " + getRightMin(root).data);
                    }
                    break;
                case 6:
                    if(root == null){
                        System.out.println("Tree is empty");
                    }
                    else{
                        System.out.println("Maximum element is : " + getRightMax(root).data);
                    }
                    break;
                case 7:
                    if(root == null){
                        System.out.println("Tree is empty");
                    }
                    else{
                        System.out.println("Size of the tree is : " + getSize(root));
                    }
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static int getSize(Node root){
        if(root == null){
            return 0;
        }
        else{
            return getSize(root.left) + getSize(root.right) + 1;
        }
    } 

    public static Node recursiveDelete(Node root, int data){
        if(root == null){
            return null;
        }

        if(data < root.data){
            root.left = recursiveDelete(root.left, data);
        }
        else if(data > root.data){
            root.right = recursiveDelete(root.right, data);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
            else{
                Node temp = getRightMin(root.right);
                root.data = temp.data;
                root.right = recursiveDelete(root.right, temp.data);
            }
        }
        return root;
    }

    public static Node recursiveGetRightMin(Node root) {
        if(root == null) {
            return null;
        }
        if(root.left == null) {
            return root;
        }
        return getRightMin(root.left);
    }

    public static Node iterativeGetRightMin(Node root) {
        if(root == null) {
            return null;
        }
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node getRightMin(Node root){
        return(recursiveGetRightMin(root));
    }

    public static Node recursiveGetRightMax(Node root) {
        if(root == null) {
            return null;
        }
        if(root.right == null) {
            return root;
        }
        return getRightMax(root.right);
    }

    public static Node iterativeGetRightMax(Node root) {
        if(root == null) {
            return null;
        }
        while(root.right != null) {
            root = root.right;
        }
        return root;
    }

    public static Node getRightMax(Node root){
        return(recursiveGetRightMax(root));
    }

    public static Node iterativeDelete(Node root, int data){
        if(root == null){
            System.out.println("Tree is empty");
            return null;
        }

        Node temp = root;
        Node parent = root;

        while(temp != null){
            if(temp.data > data){
                parent = temp;
                temp = temp.left;
            }
            else if(temp.data < data){
                parent = temp;
                temp = temp.right;
            }
            else{
                if(temp.left == null && temp.right == null){
                    if(temp == root){
                        root = null;
                    }
                    else if(parent.left == temp){
                        parent.left = null;
                    }
                    else{
                        parent.right = null;
                    }
                }
                else if(temp.right == null){
                    if(temp == root){
                        root = temp.left;
                    }
                    else{
                        if(parent.left == temp){
                            parent.left = temp.left;
                        }
                        else{
                            parent.right = temp.left;
                        }
                    }
                }

                else if(temp.left == null){
                    if(temp.data == root.data){
                        root = temp.right;
                    }
                    else{
                        if(parent.left == temp){
                            parent.left = temp.right;
                        }
                        else{
                            parent.right = temp.right;
                        }
                    }
                }

                else{
                    Node successor = temp.right;
                    Node successorParent = temp;
                    while(successor.left != null){
                        successorParent = successor;
                        successor = successor.left;
                    }
                    temp.data = successor.data;
                    if(successorParent.left == successor){
                        successorParent.left = successor.right;
                    }
                    else{
                        successorParent.right = successor.right;
                    }
                }
                return root;
            }
        }
        System.out.println("Not Found");
        return root;
    }

    public static Node delete(Node root, int data){
        return(recursiveDelete(root, data));
    }

    public static Node recursiveInsert(Node root, int data){
        if(root == null){
            return getNewNode(data);
        }
        if(data == root.data){
            System.out.println("Duplicate element");
            return root;
        }
        else if(data < root.data){
            root.left = recursiveInsert(root.left, data);
        }
        else{
            root.right = recursiveInsert(root.right, data);
        }
        return root;
    }

    public static Node iterativeInsert(Node root, int data){
        if(root == null){
            return(getNewNode(data));
        }

        Node temp = root;
        Node parent = root;
        
        while(temp != null){
            parent = temp;
            if(temp.data > data){
                temp = temp.left;
            }
            else if(temp.data == data){
                System.out.println("Duplicate element");
                return root;
            }
            else{
                temp = temp.right;
            }
        }

        if(parent.data > data){
            parent.left = getNewNode(data);
        }
        else{
            parent.right = getNewNode(data);
        }

        return root;
        
    }

    public static Node insert(Node root, int data){
        return(recursiveInsert(root, data));
    }

    

    public static int recursiveSearch(Node root, int key){      // 0 if not found and 1 if found
        if(root == null){
            return 0;
        }
        if(root.data == key){
            return 1;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        return search(root.right, key);
    }   

    public static int iterativeSearch(Node root, int key){
        while(root != null){
            if(root.data == key){
                return 1;
            }
            if(root.data > key){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return 0;
    }

    public static int search(Node root, int key){
        return(recursiveSearch(root, key));
    }

    public static Node getNewNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    public static void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}