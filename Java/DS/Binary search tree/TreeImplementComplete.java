import java.util.Scanner;

class Node{
    public int data;
    public Node left;
    public Node right;
    public Node parent;
    public static Node root;
}
 
class TreeImplement{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            System.out.print("1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit\nEnter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    if(Node.root == null){
                        System.out.println("Tree is empty");
                        break;
                    } 
                    inorder(Node.root);
                    System.out.println();
                    break;
                case 5:
                    if(Node.root == null){
                        System.out.println("Tree is empty");
                        break;
                    }
                    preorder(Node.root);
                    System.out.println();
                    break;
                case 6:
                    if(Node.root == null){
                        System.out.println("Tree is empty");
                        break;
                    }
                    postorder(Node.root);
                    System.out.println();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void insert(){
        Node node = new Node();
        System.out.print("Enter the data: ");
        node.data = sc.nextInt();

        if(Node.root == null){
            Node.root = node;
            return;
        }
        else{
            Node current = Node.root;
            Node parent = null;
            while(current != null){
                parent = current;
                if(node.data < current.data){
                    current = current.left;
                }
                else{
                    current = current.right;
                }
            }

            if(node.data == parent.data){
                System.out.println("Duplicate data");
                return;
            } 

            if(node.data < parent.data){
                parent.left = node;
            }
            else{
                parent.right = node;
            }

            node.parent = parent;
        }
            
    }

    public static void delete(){
        System.out.print("Enter the data to be deleted: ");
        int data = sc.nextInt();
        Node node = search(data);

        if(node == null){
            System.out.println("Node not found");
            return;
        }

        if(node.left == null && node.right == null){
            if(node == Node.root){
                Node.root = null;
                return;
            }
            delete(node);
        }

        else if(node.left == null && node.right != null){
            Node temp = node;
            node = node.right;
            if(temp == Node.root){
                Node.root = node;
                return;
            }
            if(node.parent.data > node.data){
                temp.parent.left = node;
            }
            else{
                temp.parent.right = node;
            }
            node.parent = temp.parent;
        }

        else if(node.left != null && node.right == null){
            Node temp = node;
            node = node.left;
            if(node == Node.root){
                Node.root = node;
                return;
            }
            if(temp.parent.data > node.data){
                node.parent.left = node;
            }
            else{
                temp.parent.right = node;
            }
            node.parent = temp.parent;
        }

        else{
            Node min = getMinNode(node);
            node.data = min.data;
            delete(min);
        }

    }

    public static Node getMinNode(Node node){
        if(node == null){
            return null;
        }
        else if(node.left == null){
            return node;
        }
        return getMinNode(node.left);
    }

    public static Node getMaxNode(Node node){
        if(node == null){
            return null;
        }
        else if(node.right == null){
            return node;
        }
        return getMaxNode(node.right);
    }

    public static void delete(Node node){
        if(node.parent == null){
            Node.root = null; 
        }
        else if(node.parent.left == node){
            node.parent.left = null;
        }
        else{
            node.parent.right = null;
        }
    }

    public static void search(){
        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        if(search(data) == null){
            System.out.println("Data not found");
        }
        else{
            System.out.println("Data found");
        }
    }

    public static Node search(int data){

        Node current = Node.root;

        while(current != null){
            if(current.data == data){
                return current;
            }
            else if(data < current.data){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
        return null;
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




/*----------------------------------------------------------------


1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 1
Enter the data: 1
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 1
Enter the data: 3
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 1
Enter the data: 2
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 1
Enter the data: 4
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 1
Enter the data: 5
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 1
Enter the data: 6
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 4
1 2 3 4 5 6 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 5
1 3 2 4 5 6 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 6
2 6 5 4 3 1 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 2
Enter the data to be deleted: 6
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 4
1 2 3 4 5 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 5
1 3 2 4 5 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 6
2 5 4 3 1 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 2
Enter the data to be deleted: 4
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 4
1 2 3 5 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 5
1 3 2 5 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 6
2 5 3 1 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 2
Enter the data to be deleted: 5
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 2
Enter the data to be deleted: 1
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 4
2 3 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 5
3 2 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 6
2 3 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 2
Enter the data to be deleted: 2
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 4
3 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 5
3 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 6
3 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 2
Enter the data to be deleted: 3
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 4
3 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 5
3 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice: 6
3 
1. Insert 2. Delete 3. Search 4. Inorder 5. Preorder 6. Postorder 7. Exit
Enter your choice:


*/