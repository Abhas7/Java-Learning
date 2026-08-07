public class LinkedList {
    private class Node {
        private int data;
        Node next;
        public Node(int data){ 
            this.data = data;
        }
        public int getData(){ 
            return this.data;
        }
    }

    private Node head, tail;

    // Add node at the end
    public void add(int data){ 
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            tail = nn;
        }else{
            tail.next = nn; 
            tail = nn;                                                                                                                           
        }
    }

    // Print all nodes in the linked list   
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert node at specific index (0-based)
    public void insert(int data, int idx){
        if (idx < 0) return;
        if (idx == 0) {
            Node nn = new Node(data);
            nn.next = head;
            head = nn;
            if (tail == null) tail = nn;
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;

        Node nn = new Node(data);
        nn.next = temp.next;
        temp.next = nn;
        if (nn.next == null) {
            tail = nn;
        }
    }

    // Delete node by value (deletes the first node containing target data)
    public boolean deleteByValue(int data) {
        if (head == null) return false;

        // Case 1: Deleting head node
        if (head.getData() == data) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return true;
        }

        // Case 2: Traverse to find node prior to target node
        Node temp = head;
        while (temp.next != null && temp.next.getData() != data) {
            temp = temp.next;
        }

        // Node found
        if (temp.next != null) {
            if (temp.next == tail) {
                tail = temp; // Update tail if deleting last node
            }
            temp.next = temp.next.next;
            return true;
        }

        return false; // Value not found
    }

    // Delete node by index (0-based index)
    public boolean deleteAtIndex(int idx) {
        if (head == null || idx < 0) return false;

        // Case 1: Deleting head node (index 0)
        if (idx == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return true; 
        }

        // Case 2: Traverse to node at (idx - 1)
        Node temp = head;
        for (int i = 0; i < idx - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) return false; // Out of bounds

        if (temp.next == tail) {
            tail = temp; // Update tail if deleting last node
        }
        temp.next = temp.next.next;
        return true;
    }
}

