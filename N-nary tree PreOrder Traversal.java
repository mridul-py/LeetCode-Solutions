/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        processNode(root, result);
        return result;
    }

    private static void processNode(Node node, List<Integer> resultList) {
        if (node == null) {
            return;
        }
        resultList.add(node.val);
        for (Node child : node.children) {
            processNode(child, resultList);
        }
    }
}
