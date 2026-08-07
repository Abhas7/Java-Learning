public class BinarySearch {
    private class Node {
        private int data;
        private Node left, right;
        public Node(int data) { 
 
        }
        public int getData(){
            return this.data; 

        }
    }; 
    private Node root;
    public void add(int data){
        Node node = new Node(data);
        if (root == null){
            root = node;
        }
        else if (root.left == null && node.getData() < root.getData()){
            root.left = node;
        }
        else if (root.right == null && node.getData() > root.getData()){
            root.right = node;
        }
        else{
            add(node.getData());
        }
    }
    
}
