public class MergeLinkedLists{
    public static void main(String[] args){
        Node linked_list1 = Node.get_linked_list();
        Node linked_list2 = Node.get_linked_list();

        Node merged_list = merge_sorted_linked_lists(linked_list1, linked_list2);

        System.out.println("\nThe merged list is : ");
        Node.printLinkedList(merged_list);
        System.out.println();
    }

    public static Node merge_sorted_linked_lists(Node linked_list1, Node linked_list2){
        Node merged_list_head = null; // head of the merged list
        Node merged_list_tail = null; // tail of the merged list

        Node temp1 = linked_list1;
        Node temp2 = linked_list2;

        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                Node new_node = new Node(temp1.data);
                if(merged_list_head == null){
                    merged_list_head = new_node;
                    merged_list_tail = new_node;
                }
                else{
                    if(temp1.data == merged_list_tail.data){
                        temp1 = temp1.next;
                        continue;
                    }
                    merged_list_tail.next = new_node;
                    new_node.prev = merged_list_tail;
                    merged_list_tail = new_node;
                }
                temp1 = temp1.next;
            }
            else{
                Node new_node = new Node(temp2.data);
                if(merged_list_head == null){
                    merged_list_head = new_node;
                    merged_list_tail = new_node;
                }
                else{
                    if(temp2.data == merged_list_tail.data){
                        temp2 = temp2.next;
                        continue;
                    }
                    merged_list_tail.next = new_node;
                    new_node.prev = merged_list_tail;
                    merged_list_tail = new_node;
                }
                temp2 = temp2.next;
            }
        }

        while(temp1 != null){
            Node new_node = new Node(temp1.data);
            if(merged_list_head == null){
                merged_list_head = new_node;
                merged_list_tail = new_node;
            }
            else{
                if(temp1.data == merged_list_tail.data){
                    temp1 = temp1.next;
                    continue;
                }
                merged_list_tail.next = new_node;
                new_node.prev = merged_list_tail;
                merged_list_tail = new_node;
            }
            temp1 = temp1.next;
        }

        while(temp2 != null){
            Node new_node = new Node(temp2.data);
            if(merged_list_head == null){
                merged_list_head = new_node;
                merged_list_tail = new_node;
            }
            else{
                if(temp2.data == merged_list_tail.data){
                    temp2 = temp2.next;
                    continue;
                }
                merged_list_tail.next = new_node;
                new_node.prev = merged_list_tail;
                merged_list_tail = new_node;
            }
            temp2 = temp2.next;
        }

        return merged_list_head;
        
    }

    
}